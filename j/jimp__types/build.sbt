organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.1-ff30ac"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.1-4aa580",
  "org.scalablytyped" %%% "jimp__core" % "0.16.1-182715",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.1-142504",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.1-8be4cf",
  "org.scalablytyped" %%% "jimp__png" % "0.16.1-5d85d5",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.1-383b80",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
