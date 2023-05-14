organization := "org.scalablytyped"
name := "jest-resolve-dependencies"
version := "29.5.0-f21e98"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expect" % "29.5.0-8cba90",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20230108Z-cd38cc",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-5d8c07",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-b22ccd",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-8104f2",
  "org.scalablytyped" %%% "jest-diff" % "29.5.0-3e64f3",
  "org.scalablytyped" %%% "jest-haste-map" % "29.5.0-983de2",
  "org.scalablytyped" %%% "jest-matcher-utils" % "29.5.0-862b1a",
  "org.scalablytyped" %%% "jest-resolve" % "29.5.0-ee87ae",
  "org.scalablytyped" %%% "jest-snapshot" % "29.5.0-9db388",
  "org.scalablytyped" %%% "jest__expect-utils" % "29.5.0-4b9159",
  "org.scalablytyped" %%% "jest__schemas" % "29.4.3-7a81bb",
  "org.scalablytyped" %%% "jest__types" % "29.5.0-5cfbb9",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "pretty-format" % "29.5.0-e0482b",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.28.9-55f540",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
