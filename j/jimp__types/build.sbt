organization := "org.scalablytyped"
name := "jimp__types"
version := "0.9.8-fbd43b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.9.8-192137",
  "org.scalablytyped" %%% "jimp__core" % "0.9.8-f1ba60",
  "org.scalablytyped" %%% "jimp__gif" % "0.9.8-118e2d",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.9.8-a60b94",
  "org.scalablytyped" %%% "jimp__png" % "0.9.8-8a9d02",
  "org.scalablytyped" %%% "jimp__tiff" % "0.9.8-ecd501",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
