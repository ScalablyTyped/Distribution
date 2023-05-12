organization := "org.scalablytyped"
name := "jest-runtime"
version := "29.5.0-394630"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "callsites" % "4.0.0-247142",
  "org.scalablytyped" %%% "collect-v8-coverage" % "1.0.1-1eac02",
  "org.scalablytyped" %%% "expect" % "29.5.0-8cba90",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20230108Z-149e58",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-5d8c07",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-b22ccd",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-8104f2",
  "org.scalablytyped" %%% "jest-diff" % "29.5.0-3e64f3",
  "org.scalablytyped" %%% "jest-haste-map" % "29.5.0-590685",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.5.0-862b1a",
  "org.scalablytyped" %%% "jest-message-util" % "29.5.0-0f7bb4",
  "org.scalablytyped" %%% "jest-mock" % "29.5.0-98310c",
  "org.scalablytyped" %%% "jest-resolve" % "29.5.0-d6ac3b",
  "org.scalablytyped" %%% "jest-snapshot" % "29.5.0-406c40",
  "org.scalablytyped" %%% "jest__console" % "29.5.0-bf3444",
  "org.scalablytyped" %%% "jest__environment" % "29.5.0-2708e0",
  "org.scalablytyped" %%% "jest__expect" % "29.5.0-48831c",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.5.0-4b9159",
  "org.scalablytyped" %%% "jest__fake-timers" % "29.5.0-e87bbe",
  "org.scalablytyped" %%% "jest__schemas" % "29.4.3-7a81bb",
  "org.scalablytyped" %%% "jest__source-map" % "29.4.3-feac41",
  "org.scalablytyped" %%% "jest__test-result" % "29.5.0-e1b822",
  "org.scalablytyped" %%% "jest__transform" % "29.5.0-03b4f4",
  "org.scalablytyped" %%% "jest__types" % "29.5.0-2b1d28",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "pretty-format" % "29.5.0-e0482b",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.28.9-55f540",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20211202Z-45e697",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
