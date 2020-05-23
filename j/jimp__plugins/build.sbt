organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.9.8-c11cef"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.9.8-f1ba60",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.9.8-310958",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.9.8-8c8ac3",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.9.8-0ea3b4",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.9.8-57f07d",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.9.8-f85530",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.9.8-798d97",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.9.8-10cd90",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.9.8-d0552f",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.9.8-3669ca",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.9.8-2cb20d",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.9.8-33322a",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.9.8-75f914",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.9.8-65a7ea",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.9.8-9f4ad3",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.9.8-cea1c2",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.9.8-3503e4",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.9.8-b0122b",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.9.8-ced6db",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.9.8-0b97b5",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.9.8-b23a4d",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.9.8-2ba095",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
