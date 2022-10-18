organization := "org.scalablytyped"
name := "jest__expect"
version := "29.2.0-f7cfd1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expect" % "29.2.0-6e8515",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-8db038",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-1eb72d",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-9f6295",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-a20c7f",
  "org.scalablytyped" %%% "jest-diff" % "29.2.0-d6b4c8",
  "org.scalablytyped" %%% "jest-haste-map" % "29.2.0-bf4e40",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.2.0-f56adc",
  "org.scalablytyped" %%% "jest-snapshot" % "29.2.0-8771bc",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.2.0-256936",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-505a1a",
  "org.scalablytyped" %%% "jest__types" % "29.2.0-aac190",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "pretty-format" % "29.2.0-869c0c",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-6b8c7a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
