organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.2-3b2af3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-53fbc6",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20190322Z-fa5c98",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-0a41ad",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-a8786c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ce8e08",
  "org.scalablytyped" %%% "handlebars" % "4.1.1-069f77",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20190322Z-89b081",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190329Z-b908a7",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20190322Z-87cc67",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-7a822c",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20190322Z-0f4917",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190401Z-4d67ca",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1b6210",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "typedoc" % "0.14.2-95a5ed",
  "org.scalablytyped" %%% "typescript" % "3.4.1-a42773")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        