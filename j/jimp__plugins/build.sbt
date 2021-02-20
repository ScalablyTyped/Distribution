organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.16.1-5a0e80"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "jimp__core" % "0.16.1-a8a0a9",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.1-bd016c",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.1-eca372",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.1-a1d81b",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.1-15b2fd",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.1-b6ad06",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.1-0c902c",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.1-ebdc95",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.1-8d4b23",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.1-bab2b5",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.1-46112e",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.1-4e3d0a",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.1-5926be",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.1-a0c307",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.1-4bea83",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.1-097a3f",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.1-10b31e",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.1-837d31",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.1-af8bd0",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.1-e26f31",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.1-b9c0f2",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.1-9abb31",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
