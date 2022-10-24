organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.2-846433"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-2e6945",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-fe947b",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-8ee950",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-940263",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-768f43",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-ad6610",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
