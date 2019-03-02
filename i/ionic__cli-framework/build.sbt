organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.6.1-1777ce"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-99c1e4",
  "org.scalablytyped" %%% "chalk" % "2.4.2-d27947",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-c289fb",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-779d70",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-ccd3b7",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-cb3aae",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-105e95",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20190221Z-8705ae",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.1.0-b6fa81",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "log-update" % "2.0-dt-20180214Z-19c3b7",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8c05a2",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-e2a650",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-e659a3",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-6bffa3",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-b40c6d",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-2a0c96",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-9f13fc",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-6f22df",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-5fff10",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-11e179",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-7a0fba",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-03fd03",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-1f4270",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-54ea62",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-773426",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-a5b4e8",
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181119Z-8a6935",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180530Z-beae41",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180214Z-1f99d1",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-cc56f3",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-45704c",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-8224ec",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-144988",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9355d3",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180214Z-ade489",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180323Z-dc0284",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-976197")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        