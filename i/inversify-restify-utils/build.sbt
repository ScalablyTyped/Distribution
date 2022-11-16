organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.5.0-3ce232"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-730932",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-ad9c7a",
  "org.scalablytyped" %%% "inversify" % "6.0.1-d4bb21",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-5b2389",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-f5926e",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
