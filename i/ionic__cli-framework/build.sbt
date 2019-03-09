organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.6.3-f9d09e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-escapes" % "3.0-dt-20190306Z-0cf9cb",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-15d04a",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6ee70e",
  "org.scalablytyped" %%% "cli-cursor" % "2.1-dt-20181224Z-2bbdef",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-1a1d0f",
  "org.scalablytyped" %%% "cross-spawn" % "6.0-dt-20190228Z-95979b",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-38137e",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-046366",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-a21654",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20190221Z-ce485e",
  "org.scalablytyped" %%% "ionic__utils-array" % "0.0.1-fdd8d0",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.2.0-ebac8b",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-dd72d4",
  "org.scalablytyped" %%% "ionic__utils-process" % "0.1.0-6299f5",
  "org.scalablytyped" %%% "ionic__utils-stream" % "0.0.1-bfd284",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "0.1.0-6f08d6",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "0.0.1-2d4966",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "log-update" % "3.1.0-3c71c4",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-5de375",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-49bec0",
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
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180530Z-2bab90",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180214Z-ded4ec",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-bedf31",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-e7a9c4",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-38e679",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-e32c2a",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180214Z-824e4d",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180323Z-319ff9",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-4175d9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        