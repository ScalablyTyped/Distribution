organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.2-7919b0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-5a4727",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-6ca6c4",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-0c94f2",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-04234f",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-57e219",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-5f7038",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
