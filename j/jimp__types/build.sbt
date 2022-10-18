organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.2-5a189b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-ce4ac3",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-f64a4d",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-b9f795",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-f9aa9b",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-323b21",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-305199",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
