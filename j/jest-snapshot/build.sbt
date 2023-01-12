organization := "org.scalablytyped"
name := "jest-snapshot"
version := "29.3.1-9faca2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expect" % "29.3.1-3e2721",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-139444",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-352082",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-a88e29",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-560c9d",
  "org.scalablytyped" %%% "jest-diff" % "29.3.1-b140f8",
  "org.scalablytyped" %%% "jest-haste-map" % "29.3.1-e50510",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.3.1-3d6ecf",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.3.1-c114de",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-8f49ad",
  "org.scalablytyped" %%% "jest__types" % "29.3.1-d79af1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "pretty-format" % "29.3.1-5acb29",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-351ac1",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
