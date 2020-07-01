organization := "org.scalablytyped"
name := "jimp__types"
version := "0.9.8-f76e12"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.9.8-7bd838",
  "org.scalablytyped" %%% "jimp__core" % "0.9.8-b0b5e6",
  "org.scalablytyped" %%% "jimp__gif" % "0.9.8-0bd802",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.9.8-bff35f",
  "org.scalablytyped" %%% "jimp__png" % "0.9.8-82b4f4",
  "org.scalablytyped" %%% "jimp__tiff" % "0.9.8-dbb837",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
