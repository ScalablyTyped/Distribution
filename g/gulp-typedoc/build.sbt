organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.2-498b27"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-7ea915",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-85e9e1",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180510Z-9e27cc",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-5f81ae",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-811058",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-448338",
  "org.scalablytyped" %%% "handlebars" % "4.1.0-67ed35",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-017b27",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190305Z-69ec69",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-17cb16",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-f312f2",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-db7190",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190212Z-0b19af",
  "org.scalablytyped" %%% "source-map" % "0.7.3-39089e",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "typedoc" % "0.14.2-e0e7b0",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-4b18ce")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        