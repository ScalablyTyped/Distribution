organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.2-ee48ac"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-53fbc6",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20190322Z-70da4d",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-0a41ad",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-6d3a60",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-3f0045",
  "org.scalablytyped" %%% "handlebars" % "4.1.1-62caff",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20190322Z-89b081",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190403Z-ce3324",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20190322Z-87cc67",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-7a822c",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20190322Z-6f9da2",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190401Z-452b1e",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1b6210",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "typedoc" % "0.14.2-1770a9",
  "org.scalablytyped" %%% "typescript" % "3.4.3-a42773",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-c8c046")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        