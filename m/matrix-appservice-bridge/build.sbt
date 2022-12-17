organization := "org.scalablytyped"
name := "matrix-appservice-bridge"
version := "6.0.0-df50db"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "axios" % "1.1.3-749205",
  "org.scalablytyped" %%% "chalk" % "5.1.2-44f540",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cb1e35",
  "org.scalablytyped" %%% "express-rate-limit" % "6.7.0-be3bce",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5f1c10",
  "org.scalablytyped" %%% "logform" % "2.4.2-518243",
  "org.scalablytyped" %%% "matrix-appservice" % "1.1.0-6a1678",
  "org.scalablytyped" %%% "matrix-bot-sdk" % "0.6.2-befd23",
  "org.scalablytyped" %%% "matrix-org__matrix-sdk-crypto-nodejs" % "0.1.0-beta.1-82396c",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-85c9dc",
  "org.scalablytyped" %%% "nedb" % "1.8-dt-20211202Z-1215ed",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-fcae78",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-137229",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-d3379f",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "winston" % "3.8.2-e286d5",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-7f49ca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
