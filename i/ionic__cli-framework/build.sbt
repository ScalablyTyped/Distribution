organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.5.0-bf3a60"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-226182",
  "org.scalablytyped" %%% "chalk" % "2.4.1-c5701d",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-7f8b58",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-9f2619",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-ca86dd",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-274633",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180910Z-d213d4",
  "org.scalablytyped" %%% "ionic__utils-fs" % "0.0.5-c58f0c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "log-update" % "2.0-dt-20180910Z-b26ce8",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-c002a7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-ab6005",
  "org.scalablytyped" %%% "ncp" % "v2.0.0-dt-20180910Z-5f3ce0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180910Z-599027",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180910Z-86ac01",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-5d69f6",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-77fc4c",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-405c2e",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180910Z-72737d",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181120Z-40cb07",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180910Z-1f2435",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180910Z-f4b184",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180910Z-a3ae35",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180910Z-dc2dd5",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180910Z-a47c84",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180910Z-19d72b",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180910Z-cc612b",
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181120Z-fe5ea6",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180910Z-cf2661",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180910Z-ff2aec",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-7348e2",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180910Z-732eca",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-c75d0b",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-85f9e2",
  "org.scalablytyped" %%% "tslib" % "1.9.3-866b29",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180910Z-ed9b95",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180910Z-09691f",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180910Z-fe7d23")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        