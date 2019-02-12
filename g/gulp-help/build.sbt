organization := "org.scalablytyped"
name := "gulp-help"
version := "0.0-unknown-dt-20180214Z-2cd8c2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-d89c9d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b78482",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-49c1ae",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-a6a4f3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "orchestrator" % "0.3-dt-20180214Z-a2fd37",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-306676",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180217Z-8226f5",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-573913",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-fd50d2",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190128Z-2d37cb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        