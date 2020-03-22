organization := "org.scalablytyped"
name := "jimp__types"
version := "0.9.3-68bdbe"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.9.3-7b944d",
  "org.scalablytyped" %%% "jimp__core" % "0.9.3-70150b",
  "org.scalablytyped" %%% "jimp__gif" % "0.9.3-7d595c",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.9.3-075567",
  "org.scalablytyped" %%% "jimp__png" % "0.9.3-d3fb6a",
  "org.scalablytyped" %%% "jimp__tiff" % "0.9.3-3c12f8",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
