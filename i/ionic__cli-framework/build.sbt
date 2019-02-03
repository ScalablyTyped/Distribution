organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.6.0-58e9d1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-94ad9b",
  "org.scalablytyped" %%% "chalk" % "2.4.2-4d2e54",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-048d4d",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-18ad8e",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-964066",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-948114",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e30bdd",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-8a253f",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.0.0-4d8a56",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "log-update" % "2.0-dt-20180214Z-8a2d74",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-e16824",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-df5b71",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-604f43",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-7bea92",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-e126f2",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-9d3a33",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-712703",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-dc77ef",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-a2afba",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-f49bdb",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-810f55",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-71b5f3",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-b8b22f",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-c96529",
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181119Z-63e423",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180530Z-6de48c",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180214Z-4b2543",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-20da60",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-057efa",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-28458a",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-479479",
  "org.scalablytyped" %%% "tslib" % "1.9.3-2d26d9",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180214Z-25e6d0",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180323Z-d1c77d",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-f09303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        