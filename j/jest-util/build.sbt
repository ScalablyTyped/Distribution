organization := "org.scalablytyped"
name := "jest-util"
version := "24.9.0-38fa75"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "callsites" % "3.1.0-c954a4",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-707c57",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-a56c7d",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20200720Z-060d09",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-c3100b",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-6f4027",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-ff3c6b",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-edcd00",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-f568e3",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-dc861f",
  "org.scalablytyped" %%% "jest__types" % "26.6.2-2c91e1",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20200921Z-ebb610",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
