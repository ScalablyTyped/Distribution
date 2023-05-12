organization := "org.scalablytyped"
name := "jest__environment"
version := "29.5.0-2708e0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-5d8c07",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-b22ccd",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-8104f2",
  "org.scalablytyped" %%% "jest-message-util" % "29.5.0-0f7bb4",
  "org.scalablytyped" %%% "jest-mock" % "29.5.0-98310c",
  "org.scalablytyped" %%% "jest__fake-timers" % "29.5.0-e87bbe",
  "org.scalablytyped" %%% "jest__schemas" % "29.4.3-7a81bb",
  "org.scalablytyped" %%% "jest__types" % "29.5.0-2b1d28",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.28.9-55f540",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20211202Z-45e697",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
