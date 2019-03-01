organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.2-62c991"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-d302db",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180510Z-12b926",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-a49d44",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-881432",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-eb36a4",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20181213Z-99db49",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-a89a22",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190212Z-d204a1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8c05a2",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-ab1274",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-5bc3b3",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190212Z-963f39",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "typedoc" % "0.14.2-caf5a8",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-5c20b0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        