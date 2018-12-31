organization := "org.scalablytyped"
name := "gulp-tsd"
version := "0.0-unknown-dt-20180214Z-8a62dd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-45865a",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ef1d9b",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-793fb8",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-af65d4",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-753f08",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180217Z-42bfa6",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-502ecd",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-ca5832",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-8ee57c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        