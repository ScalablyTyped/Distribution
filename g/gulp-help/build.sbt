organization := "org.scalablytyped"
name := "gulp-help"
version := "0.0-unknown-dt-20180214Z-b07640"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-3de748",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-00b149",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-7173d5",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-805be9",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-785a8e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "orchestrator" % "0.3-dt-20180214Z-d2ccdc",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-b7ac87",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180217Z-f0725d",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-00ef4b",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-18e734",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190128Z-787caa")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        