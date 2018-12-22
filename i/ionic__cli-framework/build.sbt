organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.5.1-610117"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-6fdba3",
  "org.scalablytyped" %%% "chalk" % "2.4.1-44ad3c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-633954",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e4c78d",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-cb7b0b",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-790699",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-f1754f",
  "org.scalablytyped" %%% "ionic__utils-fs" % "0.0.6-151988",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "log-update" % "2.0-dt-20180214Z-a79919",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-7791d7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-077fe7",
  "org.scalablytyped" %%% "ncp" % "v2.0.0-dt-20180214Z-7ac39d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-dc4b5e",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-01fdde",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-88559c",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-75edf5",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-156ef4",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-0cf36e",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-f2dc56",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-82424d",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-98aef3",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-c0541d",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-550f0b",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-4ba582",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-ab7a65",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-695e85",
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181119Z-9b3a5e",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180530Z-4e63ee",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180214Z-1dfa6d",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-5f497b",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-894b7b",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-467a57",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-783c46",
  "org.scalablytyped" %%% "tslib" % "1.9.3-417c1f",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180214Z-8d14fa",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180323Z-701347",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-7e37f4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        