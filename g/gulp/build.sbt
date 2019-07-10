organization := "org.scalablytyped"
name := "gulp"
version := "4.0-dt-20190405Z-c8ba92"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.2-4bd5a7",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-046942",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-33877a",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-41d0ad",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190709Z-570c89",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-9794f3",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-f9ecbf",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-43117c",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-7d271a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        