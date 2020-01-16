organization := "org.scalablytyped"
name := "jimp__types"
version := "0.8.5-7912cf"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__bmp" % "0.8.5-9a875c",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-5f08ad",
  "org.scalablytyped" %%% "jimp__gif" % "0.8.5-0e2c9a",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.8.5-3bec47",
  "org.scalablytyped" %%% "jimp__png" % "0.8.5-6d0d91",
  "org.scalablytyped" %%% "jimp__tiff" % "0.8.5-1843b0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        