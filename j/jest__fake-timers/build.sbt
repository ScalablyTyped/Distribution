organization := "org.scalablytyped"
name := "jest__fake-timers"
version := "24.9.0-645f67"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "callsites" % "3.1.0-780489",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-026589",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-881d94",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20200720Z-b2c271",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-b3c34f",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-bb725e",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-d5d2a7",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-2b6bef",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-6aa125",
  "org.scalablytyped" %%% "jest__types" % "26.6.2-82a7d8",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20200921Z-8b720f",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
