organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.2-7f3505"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-7ea915",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180510Z-6de445",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-5f81ae",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-f2a81d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b3a88d",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20181213Z-a3f4ba",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-017b27",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-2e7712",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190212Z-ae87e1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-f312f2",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-7876f8",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190212Z-3807bd",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "typedoc" % "0.14.2-406d0a",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-4b18ce")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        