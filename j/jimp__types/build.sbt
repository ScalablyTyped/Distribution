organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.2-3b9f42"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-13b644",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-2d7210",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-66280a",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-40dc26",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-3b7766",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-ce4e22",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
