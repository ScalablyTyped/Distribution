organization := "org.scalablytyped"
name := "jest-runtime"
version := "29.2.1-999027"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "callsites" % "4.0.0-ff6575",
  "org.scalablytyped" %%% "collect-v8-coverage" % "1.0.1-d7f3b0",
  "org.scalablytyped" %%% "expect" % "29.2.1-3902be",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-9cea28",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-1eb72d",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-9f6295",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-a20c7f",
  "org.scalablytyped" %%% "jest-diff" % "29.2.1-a95a82",
  "org.scalablytyped" %%% "jest-haste-map" % "29.2.1-b92c1d",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.2.1-cb67bb",
  "org.scalablytyped" %%% "jest-message-util" % "29.2.1-de6f44",
  "org.scalablytyped" %%% "jest-mock" % "29.2.1-ad2c7e",
  "org.scalablytyped" %%% "jest-resolve" % "29.2.1-bedb33",
  "org.scalablytyped" %%% "jest-snapshot" % "29.2.1-2da97b",
  "org.scalablytyped" %%% "jest__console" % "29.2.1-bde846",
  "org.scalablytyped" %%% "jest__environment" % "29.2.1-c10e06",
  "org.scalablytyped" %%% "jest__expect" % "29.2.1-e6df07",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.2.1-1d957f",
  "org.scalablytyped" %%% "jest__fake-timers" % "29.2.1-8e5c04",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-505a1a",
  "org.scalablytyped" %%% "jest__source-map" % "29.2.0-8aa802",
  "org.scalablytyped" %%% "jest__test-result" % "29.2.1-8a1fe7",
  "org.scalablytyped" %%% "jest__transform" % "29.2.1-6aad24",
  "org.scalablytyped" %%% "jest__types" % "29.2.1-c1f734",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "pretty-format" % "29.2.1-4e241c",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-6b8c7a",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20211202Z-c53216",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
