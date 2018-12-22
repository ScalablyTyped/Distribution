organization := "org.scalablytyped"
name := "gulp-help"
version := "0.0-unknown-dt-20180214Z-2f801a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-0da485",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-790699",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-289c4c",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-bad7e5",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-7791d7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "orchestrator" % "0.3-dt-20180214Z-f111f7",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-725d84",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180217Z-7860ef",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-f13c75",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-29c74e",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-80e040")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        