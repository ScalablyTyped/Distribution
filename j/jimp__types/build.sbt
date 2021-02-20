organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.1-4a4537"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.1-6e4c44",
  "org.scalablytyped" %%% "jimp__core" % "0.16.1-a8a0a9",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.1-07ac19",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.1-f3ab19",
  "org.scalablytyped" %%% "jimp__png" % "0.16.1-263b0c",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.1-3a31d2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
