organization := "org.scalablytyped"
name := "jimp__types"
version := "0.9.8-e266d1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.9.8-55fd98",
  "org.scalablytyped" %%% "jimp__core" % "0.9.8-0a3dfa",
  "org.scalablytyped" %%% "jimp__gif" % "0.9.8-b4927c",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.9.8-5aee21",
  "org.scalablytyped" %%% "jimp__png" % "0.9.8-3a0e13",
  "org.scalablytyped" %%% "jimp__tiff" % "0.9.8-7ce443",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
