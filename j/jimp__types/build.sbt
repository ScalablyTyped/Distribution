organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.2-c8f4b1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-5c2fea",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-3a1ef3",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-409e47",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-7197ca",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-4f5a41",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-6ecd7f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
