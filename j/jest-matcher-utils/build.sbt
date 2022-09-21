organization := "org.scalablytyped"
name := "jest-matcher-utils"
version := "29.0.3-92eb88"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "5.0.1-c21c39",
  "org.scalablytyped" %%% "jest-diff" % "29.0.3-38d421",
  "org.scalablytyped" %%% "pretty-format" % "29.0.3-ce6eaf",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
