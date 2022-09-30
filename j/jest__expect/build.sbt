organization := "org.scalablytyped"
name := "jest__expect"
version := "29.1.2-2a4342"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expect" % "29.1.2-40fdf6",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-024736",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-cd0bb6",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-f4f4b8",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-4b2caf",
  "org.scalablytyped" %%% "jest-diff" % "29.1.2-682b8d",
  "org.scalablytyped" %%% "jest-haste-map" % "29.1.2-776d2c",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.1.2-4c4552",
  "org.scalablytyped" %%% "jest-snapshot" % "29.1.2-578a4c",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.1.2-d3b524",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-e0c396",
  "org.scalablytyped" %%% "jest__types" % "29.1.2-30d6cb",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "pretty-format" % "29.1.2-3bcd6d",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-e6bd5c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
