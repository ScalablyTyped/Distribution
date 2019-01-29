organization := "org.scalablytyped"
name := "gulp-help"
version := "0.0-unknown-dt-20180214Z-d6eb5f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-1a6d3e",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e3ca52",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-136fc4",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-8b906e",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-db2a02",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "orchestrator" % "0.3-dt-20180214Z-632716",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-74c955",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180217Z-d0d6d1",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-8cb637",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-aecc29",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-6b7c81")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        