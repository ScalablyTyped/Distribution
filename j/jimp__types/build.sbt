organization := "org.scalablytyped"
name := "jimp__types"
version := "0.8.5-d36f0e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.8.5-50fe66",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-559327",
  "org.scalablytyped" %%% "jimp__gif" % "0.8.5-51c4df",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.8.5-0f9f80",
  "org.scalablytyped" %%% "jimp__png" % "0.8.5-14f172",
  "org.scalablytyped" %%% "jimp__tiff" % "0.8.5-b10f7d",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        