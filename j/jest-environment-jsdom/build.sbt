organization := "org.scalablytyped"
name := "jest-environment-jsdom"
version := "29.0.3-5b8165"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-daefdc",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-01386c",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-5a5cdb",
  "org.scalablytyped" %%% "jest-message-util" % "29.3.1-dff2b9",
  "org.scalablytyped" %%% "jest-mock" % "29.3.1-a0e686",
  "org.scalablytyped" %%% "jest__environment" % "29.3.1-ed16f1",
  "org.scalablytyped" %%% "jest__fake-timers" % "29.3.1-eba98a",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-0dfc9a",
  "org.scalablytyped" %%% "jest__types" % "29.3.1-8f7762",
  "org.scalablytyped" %%% "jsdom" % "20.0-dt-20221107Z-5231d0",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "parse5" % "7.1.1-5d5867",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-047c8e",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20211202Z-e2bc5e",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-06bffe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
