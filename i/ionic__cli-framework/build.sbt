organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.5.2-9e7974"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-25ff53",
  "org.scalablytyped" %%% "chalk" % "2.4.2-b06515",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-a35d04",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-2025c9",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-4eeb6b",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ef1d9b",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-673ec9",
  "org.scalablytyped" %%% "ionic__utils-fs" % "0.0.7-e28736",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "log-update" % "2.0-dt-20180214Z-1ee537",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-753f08",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-54b1d3",
  "org.scalablytyped" %%% "ncp" % "v2.0.0-dt-20180214Z-0e639e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-3f2716",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-6fb779",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-db6a12",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-9e3b2f",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-2029a5",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-044016",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-00bcbf",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-e0d90b",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-d79cce",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-9014f0",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-702dbc",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-e8fc7b",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-f21f35",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-c8341e",
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181119Z-e0e622",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180530Z-7c6ff8",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180214Z-3fde37",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-a489b6",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-f71070",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-99d098",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-88ba1c",
  "org.scalablytyped" %%% "tslib" % "1.9.3-5f911d",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180214Z-9913e2",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180323Z-5a9956",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-8bfc9c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        