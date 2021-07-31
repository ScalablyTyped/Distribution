organization := "org.scalablytyped"
name := "jest__fake-timers"
version := "24.9.0-88ebb0"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "callsites" % "3.1.0-65d493",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-7566cb",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-a1e107",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20200720Z-89a2ef",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-0b3f78",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-ad4d82",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-158385",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-8304dc",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-bc2b10",
  "org.scalablytyped" %%% "jest__types" % "26.6.2-2cedcf",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20200921Z-fb3f3f",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
