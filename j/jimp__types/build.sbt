organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.2-7d6020"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-0effe1",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-38c244",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-05e684",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-166c0d",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-576e26",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-04a2ad",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
