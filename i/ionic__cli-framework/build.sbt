organization := "com.scalablytyped"
name := "ionic__cli-framework"
version := "1.1.1-2fda2f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-16b038",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ea2afe",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-566c3e",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-8c87a5",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-76e9e4",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-cc6273",
  "com.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180910Z-32d75c",
  "com.scalablytyped" %%% "ionic__utils-fs" % "0.0.3-7b88ce",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-298c87",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-dd566d",
  "com.scalablytyped" %%% "ncp" % "v2.0.0-dt-20180910Z-51266f",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "rimraf" % "2.0-dt-20180910Z-6c57e6",
  "com.scalablytyped" %%% "rx" % "4.1-dt-20180910Z-0ece3b",
  "com.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-861271",
  "com.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-7c2f3d",
  "com.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-5eb8cf",
  "com.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180910Z-3d9ec8",
  "com.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181120Z-7032f9",
  "com.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180910Z-215596",
  "com.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180910Z-de0144",
  "com.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180910Z-ee1416",
  "com.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180910Z-9547f5",
  "com.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180910Z-ff0b5b",
  "com.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180910Z-4b69c6",
  "com.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180910Z-bb1b39",
  "com.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181120Z-91ae5f",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "string-width" % "2.0-dt-20180910Z-e8c8db",
  "com.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180910Z-7d2e7d",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-f11a37",
  "com.scalablytyped" %%% "through" % "0.0-unknown-dt-20180910Z-7297cf",
  "com.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-36328f",
  "com.scalablytyped" %%% "tree-kill" % "1.2.0-b08565",
  "com.scalablytyped" %%% "tslib" % "1.9.3-224f5a",
  "com.scalablytyped" %%% "untildify" % "3.0-dt-20180910Z-dcaa1e",
  "com.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180910Z-8bb76d",
  "com.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180910Z-025315",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        