organization := "org.scalablytyped"
name := "jest-watcher"
version := "29.3.1-aa3507"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "collect-v8-coverage" % "1.0.1-c67e5d",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-139444",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-352082",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-a88e29",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-560c9d",
  "org.scalablytyped" %%% "jest-haste-map" % "29.3.1-e50510",
  "org.scalablytyped" %%% "jest-message-util" % "29.3.1-2738ee",
  "org.scalablytyped" %%% "jest-resolve" % "29.3.1-b53c69",
  "org.scalablytyped" %%% "jest__console" % "29.3.1-feb62a",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-8f49ad",
  "org.scalablytyped" %%% "jest__test-result" % "29.3.1-51b0fd",
  "org.scalablytyped" %%% "jest__types" % "29.3.1-d79af1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-351ac1",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20211202Z-916a54",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
