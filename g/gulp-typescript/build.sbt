organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-6689fd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-d302db",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-105e95",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-9f2687",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8c05a2",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-ab1274",
  "org.scalablytyped" %%% "source-map" % "0.7.3-52dc03",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-8224ec",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-5c20b0",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-c2f5fc",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-9da176")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        