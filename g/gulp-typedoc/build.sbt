organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.1-4e4d96"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-f34755",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180510Z-d96129",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20180214Z-c1258d",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-601dd9",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-37315a",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20181213Z-89542c",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-2f217e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190102Z-6138c1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-db2a02",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-339dfc",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-1cb55e",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190125Z-aecd44",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "typedoc" % "0.14.2-7e16f4",
  "org.scalablytyped" %%% "typescript" % "3.2.4-3dde35")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        