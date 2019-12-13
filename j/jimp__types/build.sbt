organization := "org.scalablytyped"
name := "jimp__types"
version := "0.8.5-b50ee3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.8.5-a8d41e",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-551d7e",
  "org.scalablytyped" %%% "jimp__gif" % "0.8.5-7397ca",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.8.5-d35634",
  "org.scalablytyped" %%% "jimp__png" % "0.8.5-8dd647",
  "org.scalablytyped" %%% "jimp__tiff" % "0.8.5-81cc55",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        