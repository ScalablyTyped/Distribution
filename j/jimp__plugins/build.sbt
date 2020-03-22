organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.9.3-37e065"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.9.3-70150b",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.9.3-da78b2",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.9.3-faf27f",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.9.3-3cee71",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.9.3-44de31",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.9.3-3815aa",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.9.3-06bff3",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.9.3-c6bd05",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.9.3-546418",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.9.3-aa1149",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.9.3-287f11",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.9.3-bd85cc",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.9.3-1712c2",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.9.3-978113",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.9.3-cbb2ef",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.9.3-671698",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.9.3-6e5dbc",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.9.3-da4d8e",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
