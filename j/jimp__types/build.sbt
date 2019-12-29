organization := "org.scalablytyped"
name := "jimp__types"
version := "0.8.5-a88842"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.8.5-435c85",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-0f655b",
  "org.scalablytyped" %%% "jimp__gif" % "0.8.5-522d0e",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.8.5-120e5d",
  "org.scalablytyped" %%% "jimp__png" % "0.8.5-cfc9fe",
  "org.scalablytyped" %%% "jimp__tiff" % "0.8.5-a3c66e",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        