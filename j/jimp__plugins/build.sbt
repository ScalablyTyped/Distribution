organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.9.6-f6dc4c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.9.6-6d3b0b",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.9.6-e146a6",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.9.6-3cf2d5",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.9.6-8fa059",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.9.6-a3a6f0",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.9.6-9e445e",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.9.6-c810e5",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.9.6-3e1cf3",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.9.6-434c42",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.9.6-139362",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.9.6-a9ea22",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.9.6-1af96f",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.9.6-e21417",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.9.6-731eb1",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.9.6-2ab73b",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.9.6-ef7002",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.9.6-94113e",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.9.6-81ad68",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
