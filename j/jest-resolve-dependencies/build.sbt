organization := "org.scalablytyped"
name := "jest-resolve-dependencies"
version := "29.2.2-dbd2e1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expect" % "29.2.2-4f508f",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-395f8b",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-32acec",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-242218",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-a4bec8",
  "org.scalablytyped" %%% "jest-diff" % "29.2.1-dc17ce",
  "org.scalablytyped" %%% "jest-haste-map" % "29.2.1-76801b",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.2.2-05aea9",
  "org.scalablytyped" %%% "jest-resolve" % "29.2.2-3a9c4c",
  "org.scalablytyped" %%% "jest-snapshot" % "29.2.2-c76887",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.2.2-7822b7",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-db208b",
  "org.scalablytyped" %%% "jest__types" % "29.2.1-156589",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "pretty-format" % "29.2.1-d73ee0",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-8e6dfd",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
