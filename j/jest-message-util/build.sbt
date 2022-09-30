organization := "org.scalablytyped"
name := "jest-message-util"
version := "29.1.2-bf3212"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-cd0bb6",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-f4f4b8",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-4b2caf",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-e0c396",
  "org.scalablytyped" %%% "jest__types" % "29.1.2-30d6cb",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-e6bd5c",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20211202Z-dfba75",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
