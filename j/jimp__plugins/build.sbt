organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.16.1-d0540b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.16.1-182715",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.1-ed5f60",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.1-16ac08",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.1-e4511b",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.1-897a0a",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.1-890796",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.1-2f10c2",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.1-41a61f",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.1-269ce8",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.1-4000aa",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.1-2a7538",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.1-6f11cb",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.1-4ed5cb",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.1-3b6884",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.1-d12c22",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.1-450234",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.1-567e4b",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.1-e28f4a",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.1-1e2227",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.1-08c2af",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.1-094d92",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.1-83dc34",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
