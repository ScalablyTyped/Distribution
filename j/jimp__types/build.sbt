organization := "org.scalablytyped"
name := "jimp__types"
version := "0.8.5-aabb3d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.8.5-710261",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-41d2a5",
  "org.scalablytyped" %%% "jimp__gif" % "0.8.5-68e21f",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.8.5-0e6b64",
  "org.scalablytyped" %%% "jimp__png" % "0.8.5-a7fe7a",
  "org.scalablytyped" %%% "jimp__tiff" % "0.8.5-bc35c9",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
