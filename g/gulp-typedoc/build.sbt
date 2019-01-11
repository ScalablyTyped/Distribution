organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.1-f4f674"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-8a50d0",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180510Z-278635",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20180214Z-eb5b6a",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-a75f26",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-342f5f",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20181213Z-abf584",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-bea7a1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190102Z-b7fd0f",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-82b5dc",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-643074",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-0dae05",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20181206Z-73227c",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "typedoc" % "0.14.1-c4aaf6",
  "org.scalablytyped" %%% "typescript" % "3.2.2-12aee5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        