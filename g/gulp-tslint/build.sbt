organization := "org.scalablytyped"
name := "gulp-tslint"
version := "8.1.3-6f1c4b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-6fdba3",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180214Z-f96ced",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-84f4a5",
  "org.scalablytyped" %%% "chalk" % "2.4.1-44ad3c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-633954",
  "org.scalablytyped" %%% "commander" % "2.19.0-89f8ea",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-2cb213",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-cb7b0b",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20180214Z-15426e",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-790699",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-67ede6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-7791d7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-e7bb46",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-8c83b1",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-e2fd38",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-5f497b",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-894b7b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-417c1f",
  "org.scalablytyped" %%% "tslint" % "5.12.0-031bcc",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-f9af89",
  "org.scalablytyped" %%% "typescript" % "3.2.2-c77b02")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        