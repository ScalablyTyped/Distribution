organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.6.1-f6b95f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-15d04a",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6ee70e",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-1a1d0f",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-38137e",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-f2a81d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b3a88d",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20190221Z-6579ca",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.1.0-7f04db",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-2e7712",
  "org.scalablytyped" %%% "log-update" % "2.0-dt-20180214Z-082266",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-5de375",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-f95ca5",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-fcf653",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-0ff5f4",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-073684",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-c6a1ff",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-d750b1",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-4bc33d",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-155534",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-a185ef",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-3fdeaa",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-11fa32",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-ffacfd",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-31722d",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-ec8b23",
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181119Z-948068",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180530Z-e57abf",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180214Z-ded4ec",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-bedf31",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-475d9c",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-2d5355",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-e32c2a",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180214Z-824e4d",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180323Z-319ff9",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-892c32")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        