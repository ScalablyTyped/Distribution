organization := "org.scalablytyped"
name := "jest-environment-jsdom"
version := "29.0.3-88cf36"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-32acec",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-242218",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-a4bec8",
  "org.scalablytyped" %%% "jest-message-util" % "29.2.1-7b07d0",
  "org.scalablytyped" %%% "jest-mock" % "29.2.2-3122f1",
  "org.scalablytyped" %%% "jest__environment" % "29.2.2-e2c410",
  "org.scalablytyped" %%% "jest__fake-timers" % "29.2.2-e5b9f6",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-db208b",
  "org.scalablytyped" %%% "jest__types" % "29.2.1-044d4c",
  "org.scalablytyped" %%% "jsdom" % "20.0-dt-20220723Z-da542f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "parse5" % "7.1.1-c1050b",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-8e6dfd",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20211202Z-be6bc6",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-337987")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
