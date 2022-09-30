organization := "org.scalablytyped"
name := "jest__test-sequencer"
version := "29.1.2-923bfb"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "collect-v8-coverage" % "1.0.1-d0e9c8",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-024736",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-cd0bb6",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-f4f4b8",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-4b2caf",
  "org.scalablytyped" %%% "jest-haste-map" % "29.1.2-776d2c",
  "org.scalablytyped" %%% "jest-message-util" % "29.1.2-bf3212",
  "org.scalablytyped" %%% "jest-resolve" % "29.1.2-ab09bb",
  "org.scalablytyped" %%% "jest__console" % "29.1.2-3089fc",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-e0c396",
  "org.scalablytyped" %%% "jest__test-result" % "29.1.2-37ee0c",
  "org.scalablytyped" %%% "jest__types" % "29.1.2-30d6cb",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-e6bd5c",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20211202Z-dfba75",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
