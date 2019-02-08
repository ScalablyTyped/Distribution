organization := "org.scalablytyped"
name := "gulp-help"
version := "0.0-unknown-dt-20180214Z-65a1e3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-5d5740",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-2bf66e",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-b95323",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-93a3a6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "orchestrator" % "0.3-dt-20180214Z-608c5d",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-306676",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180217Z-f1d3e1",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-573913",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-20f818",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190128Z-fdb16f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        