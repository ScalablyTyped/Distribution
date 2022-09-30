organization := "org.scalablytyped"
name := "matrix-appservice-bridge"
version := "6.0.0-053259"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "axios" % "0.27.2-2e94c5",
  "org.scalablytyped" %%% "chalk" % "5.0.1-f61b4c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-646db4",
  "org.scalablytyped" %%% "express-rate-limit" % "6.6.0-348466",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-53b851",
  "org.scalablytyped" %%% "logform" % "2.4.2-992aea",
  "org.scalablytyped" %%% "matrix-appservice" % "1.1.0-91c0ab",
  "org.scalablytyped" %%% "matrix-bot-sdk" % "0.6.2-76bb57",
  "org.scalablytyped" %%% "matrix-org__matrix-sdk-crypto-nodejs" % "0.1.0-beta.1-4ec050",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-fb8f3f",
  "org.scalablytyped" %%% "nedb" % "1.8-dt-20211202Z-34b8eb",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-f39c70",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-4e85dc",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-170623",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "winston" % "3.8.2-af2abd",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-b9d63a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
