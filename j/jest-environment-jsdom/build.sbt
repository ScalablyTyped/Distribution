organization := "org.scalablytyped"
name := "jest-environment-jsdom"
version := "29.0.3-e93d43"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-1eb72d",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-9f6295",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-a20c7f",
  "org.scalablytyped" %%% "jest-message-util" % "29.2.0-69d443",
  "org.scalablytyped" %%% "jest-mock" % "29.2.0-351a14",
  "org.scalablytyped" %%% "jest__environment" % "29.2.0-f7fcc7",
  "org.scalablytyped" %%% "jest__fake-timers" % "29.2.0-cc9628",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-505a1a",
  "org.scalablytyped" %%% "jest__types" % "29.2.0-aac190",
  "org.scalablytyped" %%% "jsdom" % "20.0-dt-20220723Z-5bb123",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "parse5" % "7.1.1-a2407e",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-6b8c7a",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20211202Z-c53216",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-0fe4d5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
