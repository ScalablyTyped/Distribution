organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.8.5-738173"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-41d2a5",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.8.5-876da7",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.8.5-5519dc",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.8.5-83f04a",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.8.5-f42fc9",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.8.5-efd9df",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.8.5-604796",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.8.5-760c1f",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.8.5-481187",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.8.5-603feb",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.8.5-7b0711",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.8.5-d9bdde",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.8.5-08310a",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.8.5-6258e0",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.8.5-51ef43",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.8.5-012200",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.8.5-c745eb",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.8.5-8465e3",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
