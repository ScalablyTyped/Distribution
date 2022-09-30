organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.2-06c00d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-9b5300",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-dc002f",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-4f31ff",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-418924",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-dc8262",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-7f26a6",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
