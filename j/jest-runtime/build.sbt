organization := "org.scalablytyped"
name := "jest-runtime"
version := "29.2.2-c46e2e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "callsites" % "4.0.0-f99612",
  "org.scalablytyped" %%% "collect-v8-coverage" % "1.0.1-df6e70",
  "org.scalablytyped" %%% "expect" % "29.2.2-4f508f",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-395f8b",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-32acec",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-242218",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-a4bec8",
  "org.scalablytyped" %%% "jest-diff" % "29.2.1-dc17ce",
  "org.scalablytyped" %%% "jest-haste-map" % "29.2.1-76801b",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.2.2-05aea9",
  "org.scalablytyped" %%% "jest-message-util" % "29.2.1-5662a5",
  "org.scalablytyped" %%% "jest-mock" % "29.2.2-3122f1",
  "org.scalablytyped" %%% "jest-resolve" % "29.2.2-3a9c4c",
  "org.scalablytyped" %%% "jest-snapshot" % "29.2.2-c76887",
  "org.scalablytyped" %%% "jest__console" % "29.2.1-0db0e9",
  "org.scalablytyped" %%% "jest__environment" % "29.2.2-12fee5",
  "org.scalablytyped" %%% "jest__expect" % "29.2.2-a193aa",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.2.2-7822b7",
  "org.scalablytyped" %%% "jest__fake-timers" % "29.2.2-afd25c",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-db208b",
  "org.scalablytyped" %%% "jest__source-map" % "29.2.0-e3544e",
  "org.scalablytyped" %%% "jest__test-result" % "29.2.1-4e56e0",
  "org.scalablytyped" %%% "jest__transform" % "29.2.2-1408d7",
  "org.scalablytyped" %%% "jest__types" % "29.2.1-156589",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "pretty-format" % "29.2.1-d73ee0",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-8e6dfd",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20211202Z-be6bc6",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
