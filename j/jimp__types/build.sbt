organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.2-cd3b7a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-21d219",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-8d6812",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-9c8fdb",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-58e664",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-ab66cd",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-a82423",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
