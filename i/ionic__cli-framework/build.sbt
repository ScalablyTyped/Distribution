organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.5.0-5b4c18"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-c75411",
  "org.scalablytyped" %%% "chalk" % "2.4.1-668e15",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-2e1e39",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0c31be",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-7b7662",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-63ba70",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180910Z-fcdff1",
  "org.scalablytyped" %%% "ionic__utils-fs" % "0.0.5-a3306a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "log-update" % "2.0-dt-20180910Z-f5a1bb",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-4563df",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-231fe7",
  "org.scalablytyped" %%% "ncp" % "v2.0.0-dt-20180910Z-6343bc",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180910Z-017a29",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180910Z-fa4250",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-45a578",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-714f18",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-9bc129",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180910Z-a50f0c",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181120Z-497cf1",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180910Z-205d1d",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180910Z-244780",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180910Z-7d3dd3",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180910Z-083af1",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180910Z-4ce50c",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180910Z-e4b8f6",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180910Z-f54510",
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181120Z-9f1a4d",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180910Z-4771df",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180910Z-cd0aa3",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-b77f09",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180910Z-13de13",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-f36a40",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-2015b5",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6146fe",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180910Z-a44dac",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180910Z-e44613",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180910Z-c16cc7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        