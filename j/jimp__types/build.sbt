organization := "org.scalablytyped"
name := "jimp__types"
version := "0.9.8-264a5c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.9.8-18f946",
  "org.scalablytyped" %%% "jimp__core" % "0.9.8-c675ff",
  "org.scalablytyped" %%% "jimp__gif" % "0.9.8-22f9c2",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.9.8-ea0c80",
  "org.scalablytyped" %%% "jimp__png" % "0.9.8-00c0de",
  "org.scalablytyped" %%% "jimp__tiff" % "0.9.8-bc42a5",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
