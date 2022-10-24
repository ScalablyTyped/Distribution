organization := "org.scalablytyped"
name := "jest-runner"
version := "29.2.1-f9369b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "collect-v8-coverage" % "1.0.1-fdea52",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-a443ec",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-32acec",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-242218",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-a4bec8",
  "org.scalablytyped" %%% "jest-haste-map" % "29.2.1-d4f9f8",
  "org.scalablytyped" %%% "jest-message-util" % "29.2.1-366b7a",
  "org.scalablytyped" %%% "jest-resolve" % "29.2.1-61b435",
  "org.scalablytyped" %%% "jest-watcher" % "29.2.1-9412aa",
  "org.scalablytyped" %%% "jest__console" % "29.2.1-dfd50b",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-db208b",
  "org.scalablytyped" %%% "jest__test-result" % "29.2.1-d3da1f",
  "org.scalablytyped" %%% "jest__types" % "29.2.1-c4e45b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-8e6dfd",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20211202Z-be6bc6",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
