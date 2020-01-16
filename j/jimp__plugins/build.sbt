organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.8.5-258107"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-5f08ad",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.8.5-56e587",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.8.5-af7554",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.8.5-e48499",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.8.5-bdf4aa",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.8.5-21abca",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.8.5-6de854",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.8.5-8d5542",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.8.5-c082cb",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.8.5-0dcf1a",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.8.5-ba3c3e",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.8.5-77c6ce",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.8.5-6c0359",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.8.5-30f16e",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.8.5-540d45",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.8.5-8781c7",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.8.5-9132d3",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.8.5-232b4e",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        