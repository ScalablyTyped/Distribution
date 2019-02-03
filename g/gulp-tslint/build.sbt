organization := "org.scalablytyped"
name := "gulp-tslint"
version := "8.1.3-7c896e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-94ad9b",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180214Z-e8f31e",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-64d288",
  "org.scalablytyped" %%% "chalk" % "2.4.2-4d2e54",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-048d4d",
  "org.scalablytyped" %%% "commander" % "2.19.0-bc6d13",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-a792d3",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-964066",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20180214Z-897bb6",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e30bdd",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-9bda5b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-0cfa58",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-e7a768",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-c9e889",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-20da60",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-057efa",
  "org.scalablytyped" %%% "tslib" % "1.9.3-2d26d9",
  "org.scalablytyped" %%% "tslint" % "5.12.1-13a77a",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-7e3e86",
  "org.scalablytyped" %%% "typescript" % "3.3.1-9debc0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        