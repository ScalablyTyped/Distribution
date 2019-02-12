organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.2-af54d4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-9d8abf",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180510Z-6fac7b",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20180214Z-897bb6",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-cf0ab9",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b78482",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20181213Z-b56f47",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-b2d4d0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190102Z-216b98",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-0cfa58",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-a01465",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190125Z-df6fb5",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "typedoc" % "0.14.2-2c29f3",
  "org.scalablytyped" %%% "typescript" % "3.3.3-7959f4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        