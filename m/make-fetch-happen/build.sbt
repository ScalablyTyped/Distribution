organization := "org.scalablytyped"
name := "make-fetch-happen"
version := "10.0-dt-20220714Z-eba424"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-975c5a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-581983",
  "org.scalablytyped" %%% "retry" % "0.12-dt-20220426Z-4c2977",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-81c7b7",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
