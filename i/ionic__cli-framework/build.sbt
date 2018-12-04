organization := "com.scalablytyped"
name := "ionic__cli-framework"
version := "1.5.0-537335"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-8b01ce",
  "com.scalablytyped" %%% "chalk" % "2.4.1-557431",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-20e4ae",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e9dd4f",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-450016",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-b89aff",
  "com.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180910Z-a423ba",
  "com.scalablytyped" %%% "ionic__utils-fs" % "0.0.5-9ba74c",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-0335c2",
  "com.scalablytyped" %%% "log-update" % "2.0-dt-20180910Z-2f7d4e",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-5ec0b9",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-a475cc",
  "com.scalablytyped" %%% "ncp" % "v2.0.0-dt-20180910Z-66204e",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "rimraf" % "2.0-dt-20180910Z-40a17a",
  "com.scalablytyped" %%% "rx" % "4.1-dt-20180910Z-49bd7e",
  "com.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-b87bbc",
  "com.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-df7bfe",
  "com.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-3db92b",
  "com.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180910Z-64ff54",
  "com.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181120Z-b0352d",
  "com.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180910Z-5d5ac6",
  "com.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180910Z-4964ae",
  "com.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180910Z-00859c",
  "com.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180910Z-e3a076",
  "com.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180910Z-4b1e9f",
  "com.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180910Z-7f8ab3",
  "com.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180910Z-d01234",
  "com.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181120Z-c51a6c",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "string-width" % "2.0-dt-20180910Z-fa7884",
  "com.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180910Z-174468",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-a10740",
  "com.scalablytyped" %%% "through" % "0.0-unknown-dt-20180910Z-d9bdc2",
  "com.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-d07fd4",
  "com.scalablytyped" %%% "tree-kill" % "1.2.1-2ce78f",
  "com.scalablytyped" %%% "tslib" % "1.9.3-9baf35",
  "com.scalablytyped" %%% "untildify" % "3.0-dt-20180910Z-3da6d9",
  "com.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180910Z-e3e906",
  "com.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180910Z-da7ffe",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        