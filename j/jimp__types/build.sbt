organization := "org.scalablytyped"
name := "jimp__types"
version := "0.8.5-e294a0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.8.5-55b46e",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-165e60",
  "org.scalablytyped" %%% "jimp__gif" % "0.8.5-4fd0f9",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.8.5-3a40ad",
  "org.scalablytyped" %%% "jimp__png" % "0.8.5-00d15f",
  "org.scalablytyped" %%% "jimp__tiff" % "0.8.5-d1567e",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        