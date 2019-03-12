organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.6.3-5abf03"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-escapes" % "3.0-dt-20190306Z-c443cf",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-052e82",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6d01d0",
  "org.scalablytyped" %%% "cli-cursor" % "2.1-dt-20181224Z-77e7d1",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1b784",
  "org.scalablytyped" %%% "cross-spawn" % "6.0-dt-20190228Z-deef2a",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-1f537b",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-2b30b5",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-334b9b",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20190221Z-23f3fa",
  "org.scalablytyped" %%% "ionic__utils-array" % "0.0.1-9de01e",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.2.0-0b9db2",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-cc0668",
  "org.scalablytyped" %%% "ionic__utils-process" % "0.1.0-694219",
  "org.scalablytyped" %%% "ionic__utils-stream" % "0.0.1-8c2896",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "0.1.0-de2213",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "0.0.1-7b4e18",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "log-update" % "3.1.0-a5f1c4",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-b5ce4c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-d2a1c9",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-afef54",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-d2f95e",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-2a1bd5",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-ecbab5",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-794432",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-e79331",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-44ae75",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-32f9e9",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-74c9e9",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-5dae72",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-ef0eac",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-bd0f41",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-0ec9a6",
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181119Z-254b3c",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180530Z-f9c705",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180214Z-81a205",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-155129",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-fc7312",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-0aa8da",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-3c1239",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180214Z-05242b",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180323Z-f18588",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-90aa5b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        