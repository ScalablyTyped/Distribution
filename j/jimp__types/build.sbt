organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.2-e1dec3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-f53d67",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-f1a548",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-a84202",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-6c08f9",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-5d2cd9",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-a83941",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
