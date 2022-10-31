organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.2-b6be23"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-fec207",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-75b22e",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-b0c2cb",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-8c18fa",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-ac3f23",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-9f4f30",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
