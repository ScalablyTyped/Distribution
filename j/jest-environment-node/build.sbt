organization := "org.scalablytyped"
name := "jest-environment-node"
version := "29.3.1-61ad00"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-c31bdf",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-d2c38f",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-29762b",
  "org.scalablytyped" %%% "jest-message-util" % "29.3.1-431443",
  "org.scalablytyped" %%% "jest-mock" % "29.3.1-637cb8",
  "org.scalablytyped" %%% "jest__environment" % "29.3.1-963479",
  "org.scalablytyped" %%% "jest__fake-timers" % "29.3.1-b6baef",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-f49641",
  "org.scalablytyped" %%% "jest__types" % "29.3.1-68e9a6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-019919",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20211202Z-bbbad6",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
