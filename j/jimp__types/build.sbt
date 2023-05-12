organization := "org.scalablytyped"
name := "jimp__types"
version := "0.22.8-bf91fd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.22.8-9c4ee5",
  "org.scalablytyped" %%% "jimp__core" % "0.22.8-1afddc",
  "org.scalablytyped" %%% "jimp__gif" % "0.22.8-7b11b6",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.22.8-f79ab7",
  "org.scalablytyped" %%% "jimp__png" % "0.22.8-accfa8",
  "org.scalablytyped" %%% "jimp__tiff" % "0.22.8-16f300",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
