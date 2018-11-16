organization := "com.scalablytyped"
name := "ionic__cli-framework"
version := "1.2.0-843265"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181102Z-d346e3",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ef8d2c",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20181102Z-8ba882",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181102Z-fdaa94",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20181102Z-6ced09",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20181102Z-ea59e6",
  "com.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20181102Z-3345a7",
  "com.scalablytyped" %%% "ionic__utils-fs" % "0.0.4-9dc85e",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20181102Z-8447c6",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20181102Z-8bed80",
  "com.scalablytyped" %%% "ncp" % "v2.0.0-dt-20181102Z-333153",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "rimraf" % "2.0-dt-20181102Z-f07fb0",
  "com.scalablytyped" %%% "rx" % "4.1-dt-20181102Z-3fe026",
  "com.scalablytyped" %%% "rx-core" % "4.0-dt-20181102Z-85961b",
  "com.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20181102Z-063c8e",
  "com.scalablytyped" %%% "rx-lite" % "4.0-dt-20181102Z-6860e9",
  "com.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20181102Z-e15cd4",
  "com.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181102Z-1425ea",
  "com.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20181102Z-cf9944",
  "com.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20181102Z-f758a5",
  "com.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20181102Z-342bd4",
  "com.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20181102Z-65b141",
  "com.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20181102Z-1e0f71",
  "com.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20181102Z-b11f3c",
  "com.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20181102Z-ffc687",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "string-width" % "2.0-dt-20181102Z-877dbf",
  "com.scalablytyped" %%% "strip-ansi" % "3.0-dt-20181102Z-bc25ba",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20181102Z-2c93a8",
  "com.scalablytyped" %%% "through" % "0.0-unknown-dt-20181102Z-7ae258",
  "com.scalablytyped" %%% "through2" % "2.0-dt-20181102Z-a2eea1",
  "com.scalablytyped" %%% "tree-kill" % "1.2.0-82c5f2",
  "com.scalablytyped" %%% "tslib" % "1.9.3-89a8f4",
  "com.scalablytyped" %%% "untildify" % "3.0-dt-20181102Z-3be8e3",
  "com.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20181102Z-5b0a52",
  "com.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20181102Z-2ec8bc",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        