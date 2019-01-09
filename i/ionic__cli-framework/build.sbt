organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.5.3-728e97"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-1b78a1",
  "org.scalablytyped" %%% "chalk" % "2.4.2-38684c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-58487f",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-7e0ea5",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-ec7424",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-a75f26",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-342f5f",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-7d0b54",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.0.0-f5c1a6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "log-update" % "2.0-dt-20180214Z-6780af",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-82b5dc",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-86ee84",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-6d142e",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-156336",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-cf02c5",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-b2d51c",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-b8adfd",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-cc68e7",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-207969",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-f8760a",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-a2c51e",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-da16da",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-1fd7ac",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-c7354c",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-c613c4",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-2c1602",
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181119Z-7a5761",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180530Z-e059dd",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180214Z-4817c7",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-729b1c",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-c4eada",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-a99e85",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-15e911",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d3fc19",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180214Z-8f7de1",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180323Z-5020d1",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-b52281")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        