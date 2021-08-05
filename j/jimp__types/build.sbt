organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.1-3155d5"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.1-eb6c6b",
  "org.scalablytyped" %%% "jimp__core" % "0.16.1-ed88dd",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.1-8e16c1",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.1-f5ead4",
  "org.scalablytyped" %%% "jimp__png" % "0.16.1-2d4493",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.1-b38cad",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
