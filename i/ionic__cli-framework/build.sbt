organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.5.3-dfecd0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-b48f67",
  "org.scalablytyped" %%% "chalk" % "2.4.2-953bc3",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-528543",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-315ade",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-86d5f2",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-95ed7f",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e3598d",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-7125d2",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.0.0-660ebb",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "log-update" % "2.0-dt-20180214Z-6d2b70",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-696dbe",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-fcc4b6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-e8ebe8",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-ab4c1e",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-42cbcd",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-390e4d",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-30a111",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-e6c363",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-f57cf9",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-f9f5e1",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-221d8f",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-d00d43",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-d5b6cc",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-2ebb12",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-8c9e58",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-44e374",
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181119Z-ac04b7",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180530Z-e3ad98",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180214Z-4e63f4",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-f611fa",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-48a958",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-7fdc70",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-9f1088",
  "org.scalablytyped" %%% "tslib" % "1.9.3-cc9481",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180214Z-8cb006",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180323Z-03dbbc",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-61e2c5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        