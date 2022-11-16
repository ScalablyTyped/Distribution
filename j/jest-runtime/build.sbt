organization := "org.scalablytyped"
name := "jest-runtime"
version := "29.3.1-d460b7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "callsites" % "4.0.0-0f1a5d",
  "org.scalablytyped" %%% "collect-v8-coverage" % "1.0.1-860f68",
  "org.scalablytyped" %%% "expect" % "29.3.1-f2fecf",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-37daa3",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-daefdc",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-01386c",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-5a5cdb",
  "org.scalablytyped" %%% "jest-diff" % "29.3.1-750906",
  "org.scalablytyped" %%% "jest-haste-map" % "29.3.1-1a3e4f",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.3.1-cb96c3",
  "org.scalablytyped" %%% "jest-message-util" % "29.3.1-dff2b9",
  "org.scalablytyped" %%% "jest-mock" % "29.3.1-a0e686",
  "org.scalablytyped" %%% "jest-resolve" % "29.3.1-24bd8c",
  "org.scalablytyped" %%% "jest-snapshot" % "29.3.1-72e562",
  "org.scalablytyped" %%% "jest__console" % "29.3.1-c26f41",
  "org.scalablytyped" %%% "jest__environment" % "29.3.1-ed16f1",
  "org.scalablytyped" %%% "jest__expect" % "29.3.1-639444",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.3.1-d26e03",
  "org.scalablytyped" %%% "jest__fake-timers" % "29.3.1-eba98a",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-0dfc9a",
  "org.scalablytyped" %%% "jest__source-map" % "29.2.0-d980fb",
  "org.scalablytyped" %%% "jest__test-result" % "29.3.1-d8e5e5",
  "org.scalablytyped" %%% "jest__transform" % "29.3.1-78c005",
  "org.scalablytyped" %%% "jest__types" % "29.3.1-8f7762",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "pretty-format" % "29.3.1-6e3e57",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-047c8e",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20211202Z-e2bc5e",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
