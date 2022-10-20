organization := "org.scalablytyped"
name := "jest__globals"
version := "29.2.1-ffda07"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expect" % "29.2.1-3902be",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-9cea28",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-1eb72d",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-9f6295",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-a20c7f",
  "org.scalablytyped" %%% "jest-diff" % "29.2.1-a95a82",
  "org.scalablytyped" %%% "jest-haste-map" % "29.2.1-b92c1d",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.2.1-cb67bb",
  "org.scalablytyped" %%% "jest-mock" % "29.2.1-ad2c7e",
  "org.scalablytyped" %%% "jest-snapshot" % "29.2.1-2da97b",
  "org.scalablytyped" %%% "jest__expect" % "29.2.1-e6df07",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.2.1-1d957f",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-505a1a",
  "org.scalablytyped" %%% "jest__types" % "29.2.1-c1f734",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "pretty-format" % "29.2.1-4e241c",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-6b8c7a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
