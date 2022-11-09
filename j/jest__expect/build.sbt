organization := "org.scalablytyped"
name := "jest__expect"
version := "29.3.1-807304"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expect" % "29.3.1-91e738",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-395f8b",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-32acec",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-242218",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-a4bec8",
  "org.scalablytyped" %%% "jest-diff" % "29.3.1-602a83",
  "org.scalablytyped" %%% "jest-haste-map" % "29.3.1-4bc640",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.3.1-e79c0c",
  "org.scalablytyped" %%% "jest-snapshot" % "29.3.1-242e9b",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.3.1-7d3f28",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-db208b",
  "org.scalablytyped" %%% "jest__types" % "29.3.1-61f653",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "pretty-format" % "29.3.1-ebbec4",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-8e6dfd",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
