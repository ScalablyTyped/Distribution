organization := "org.scalablytyped"
name := "jimp__types"
version := "0.8.5-ced7b2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.8.5-20e80d",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-bbe5c8",
  "org.scalablytyped" %%% "jimp__gif" % "0.8.5-d86ee1",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.8.5-74e5e5",
  "org.scalablytyped" %%% "jimp__png" % "0.8.5-74191a",
  "org.scalablytyped" %%% "jimp__tiff" % "0.8.5-0faec3",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        