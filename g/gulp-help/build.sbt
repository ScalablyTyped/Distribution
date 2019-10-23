organization := "org.scalablytyped"
name := "gulp-help"
version := "0.0-unknown-dt-20190322Z-a63f33"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.2.2-1e3f06",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-8ce36f",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-2c2306",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-da8f67",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-4b5d2e",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191022Z-f18ffd",
  "org.scalablytyped" %%% "orchestrator" % "0.3-dt-20190322Z-5975ec",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-c879d1",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-dd2e84",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-6c4994",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-e24b4b",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-68f1ef")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        