organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.5.0-225bf6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-ed6428",
  "org.scalablytyped" %%% "chalk" % "2.4.1-76fe8f",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-f388aa",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-c10888",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-404a30",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-b7b8a8",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180910Z-dcb539",
  "org.scalablytyped" %%% "ionic__utils-fs" % "0.0.5-bcceb2",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "log-update" % "2.0-dt-20180910Z-55b976",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-45414c",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-aae1f0",
  "org.scalablytyped" %%% "ncp" % "v2.0.0-dt-20180910Z-cdb0e5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180910Z-664e5f",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180910Z-01905d",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-9a7fbb",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-1bda7e",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-5b5635",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180910Z-f67045",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181120Z-2a1127",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180910Z-5aff23",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180910Z-6e36eb",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180910Z-d200c0",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180910Z-c3e153",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180910Z-27766f",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180910Z-368028",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180910Z-863d71",
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181120Z-c56b55",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180910Z-6b14db",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180910Z-49d6af",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-d7a900",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180910Z-8fb826",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-4c9690",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-d082b0",
  "org.scalablytyped" %%% "tslib" % "1.9.3-13238d",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180910Z-c86e7d",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180910Z-809167",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180910Z-74471c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        