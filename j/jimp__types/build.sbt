organization := "org.scalablytyped"
name := "jimp__types"
version := "0.14.0-be9b15"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.14.0-ba321c",
  "org.scalablytyped" %%% "jimp__core" % "0.14.0-eb0cd3",
  "org.scalablytyped" %%% "jimp__gif" % "0.14.0-ed690a",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.14.0-43818b",
  "org.scalablytyped" %%% "jimp__png" % "0.14.0-5a238b",
  "org.scalablytyped" %%% "jimp__tiff" % "0.14.0-2ec4f0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
