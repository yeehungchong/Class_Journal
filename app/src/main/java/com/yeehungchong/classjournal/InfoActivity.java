package com.yeehungchong.classjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity {

    Button btnAdd, btnInfo, btnEmail;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        btnAdd = findViewById(R.id.buttonAdd);
        btnInfo = findViewById(R.id.buttonInfo);
        btnEmail = findViewById(R.id.buttonEmail);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent infoIntent = new Intent(Intent.ACTION_VIEW);
                infoIntent.setData(Uri.parse("https://www.rp.edu.sg/SOI/full-time-diplomas/Details/diploma-in-digital-design-and-development"));
                startActivity(infoIntent);

            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}