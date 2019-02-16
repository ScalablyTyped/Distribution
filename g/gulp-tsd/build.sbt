organization := "org.scalablytyped"
name := "gulp-tsd"
version := "0.0-unknown-dt-20180214Z-432943"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-9fd987",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e20e66",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-470ec2",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-955f0a",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-0d969a",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190212Z-f45c9e",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-573913",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-a32e7e",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190212Z-26b7d6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        