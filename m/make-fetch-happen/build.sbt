organization := "org.scalablytyped"
name := "make-fetch-happen"
version := "10.0-dt-20220714Z-6e9a13"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-0c5722",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-a51f9b",
  "org.scalablytyped" %%% "retry" % "0.12-dt-20220426Z-125f1d",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-5bafe8",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
