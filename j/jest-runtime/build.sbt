organization := "org.scalablytyped"
name := "jest-runtime"
version := "29.3.1-3ced15"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "callsites" % "4.0.0-38b651",
  "org.scalablytyped" %%% "collect-v8-coverage" % "1.0.1-e1208b",
  "org.scalablytyped" %%% "expect" % "29.3.1-de5ae9",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-55ce36",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-c31bdf",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-d2c38f",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-29762b",
  "org.scalablytyped" %%% "jest-diff" % "29.3.1-fe1dfb",
  "org.scalablytyped" %%% "jest-haste-map" % "29.3.1-de5f9a",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.3.1-b37448",
  "org.scalablytyped" %%% "jest-message-util" % "29.3.1-431443",
  "org.scalablytyped" %%% "jest-mock" % "29.3.1-637cb8",
  "org.scalablytyped" %%% "jest-resolve" % "29.3.1-579b0a",
  "org.scalablytyped" %%% "jest-snapshot" % "29.3.1-916596",
  "org.scalablytyped" %%% "jest__console" % "29.3.1-872542",
  "org.scalablytyped" %%% "jest__environment" % "29.3.1-963479",
  "org.scalablytyped" %%% "jest__expect" % "29.3.1-d7b1b5",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.3.1-89e5b7",
  "org.scalablytyped" %%% "jest__fake-timers" % "29.3.1-b6baef",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-f49641",
  "org.scalablytyped" %%% "jest__source-map" % "29.2.0-6bdb67",
  "org.scalablytyped" %%% "jest__test-result" % "29.3.1-74bd20",
  "org.scalablytyped" %%% "jest__transform" % "29.3.1-c6f77c",
  "org.scalablytyped" %%% "jest__types" % "29.3.1-68e9a6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "pretty-format" % "29.3.1-5c00f4",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-019919",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20211202Z-bbbad6",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
