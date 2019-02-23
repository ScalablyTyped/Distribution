organization := "org.scalablytyped"
name := "gulp-help-doc"
version := "0.0-unknown-dt-20180214Z-815550"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-750c5c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-48cb89",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-372658",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-d4dae2",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190212Z-ae5c67",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-573913",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-2f8725",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190212Z-f83dc6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        