organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.8.5-66d200"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-559327",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.8.5-64e404",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.8.5-e1c512",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.8.5-a6780c",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.8.5-79b8d6",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.8.5-e9991b",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.8.5-34ca49",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.8.5-af48c2",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.8.5-c4d172",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.8.5-835d57",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.8.5-dce15e",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.8.5-0decfd",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.8.5-f29dbc",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.8.5-f562d9",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.8.5-74b50c",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.8.5-c09a91",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.8.5-f741b9",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.8.5-f2c349",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        