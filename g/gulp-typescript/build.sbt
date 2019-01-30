organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-af16fd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-f34755",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e3ca52",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-136fc4",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-db2a02",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-339dfc",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1d8315",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-533c69",
  "org.scalablytyped" %%% "typescript" % "3.2.4-3dde35",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-aecc29",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190128Z-2a7f5d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        