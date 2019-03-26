organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.2-509301"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-4c57d8",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20190322Z-8e7470",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-aee959",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-6662de",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-805214",
  "org.scalablytyped" %%% "handlebars" % "4.1.1-e49c7d",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20190322Z-6c04b8",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190307Z-73b805",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-cec35d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20190322Z-66e386",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-ce2f76",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20190322Z-a14791",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190212Z-22a858",
  "org.scalablytyped" %%% "source-map" % "0.7.3-aac742",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "typedoc" % "0.14.2-9b4cb7",
  "org.scalablytyped" %%% "typescript" % "3.3.4000-bb3585")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        