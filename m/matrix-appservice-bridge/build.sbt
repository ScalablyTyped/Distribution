organization := "org.scalablytyped"
name := "matrix-appservice-bridge"
version := "6.0.0-2b385f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "axios" % "1.1.3-02675d",
  "org.scalablytyped" %%% "chalk" % "5.1.2-2349b1",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-2966c9",
  "org.scalablytyped" %%% "express-rate-limit" % "6.7.0-073736",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5cc384",
  "org.scalablytyped" %%% "logform" % "2.4.2-48c445",
  "org.scalablytyped" %%% "matrix-appservice" % "1.1.0-afc683",
  "org.scalablytyped" %%% "matrix-bot-sdk" % "0.6.2-0cf281",
  "org.scalablytyped" %%% "matrix-org__matrix-sdk-crypto-nodejs" % "0.1.0-beta.1-40d983",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-4d0efa",
  "org.scalablytyped" %%% "nedb" % "1.8-dt-20211202Z-89937b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-1a49d1",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-fa36ba",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-088887",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "winston" % "3.8.2-9be0e7",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-a397dd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
