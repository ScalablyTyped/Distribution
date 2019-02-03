organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.2-805e75"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-d949ef",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180510Z-4a6200",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20180214Z-29481e",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-585a5f",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-64d14d",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20181213Z-c076a0",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-758ba3",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190102Z-f05108",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-785a8e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-30ca1a",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-eada3c",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190125Z-da4ae7",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "typedoc" % "0.14.2-1a0e9a",
  "org.scalablytyped" %%% "typescript" % "3.3.1-b7b6b0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        