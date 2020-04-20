organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.9.8-9515a8"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.9.8-0a3dfa",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.9.8-8c4a66",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.9.8-962b30",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.9.8-b6f4f5",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.9.8-8e070b",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.9.8-0891a7",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.9.8-f96b41",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.9.8-e9f1a9",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.9.8-b02584",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.9.8-48e819",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.9.8-e0cdb8",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.9.8-c522ba",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.9.8-41c18e",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.9.8-9e81ff",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.9.8-1edef7",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.9.8-358b40",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.9.8-123812",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.9.8-66ec53",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.9.8-ebacb2",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.9.8-538917",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.9.8-4e4642",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.9.8-f2999c",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
