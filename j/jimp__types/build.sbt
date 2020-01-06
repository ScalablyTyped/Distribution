organization := "org.scalablytyped"
name := "jimp__types"
version := "0.8.5-9fce3a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.8.5-e8c44d",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-6ebdb6",
  "org.scalablytyped" %%% "jimp__gif" % "0.8.5-a2c298",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.8.5-73c664",
  "org.scalablytyped" %%% "jimp__png" % "0.8.5-7ad199",
  "org.scalablytyped" %%% "jimp__tiff" % "0.8.5-26459e",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        