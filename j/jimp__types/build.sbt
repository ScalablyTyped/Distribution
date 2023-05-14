organization := "org.scalablytyped"
name := "jimp__types"
version := "0.22.8-f74eac"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.22.8-fc7d13",
  "org.scalablytyped" %%% "jimp__core" % "0.22.8-c119c1",
  "org.scalablytyped" %%% "jimp__gif" % "0.22.8-9d8931",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.22.8-f48b03",
  "org.scalablytyped" %%% "jimp__png" % "0.22.8-5dadb9",
  "org.scalablytyped" %%% "jimp__tiff" % "0.22.8-46e162",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
