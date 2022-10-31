organization := "org.scalablytyped"
name := "make-fetch-happen"
version := "10.0-dt-20220714Z-e37aed"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-385072",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-2f020e",
  "org.scalablytyped" %%% "retry" % "0.12-dt-20220426Z-9145a9",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-74a694",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
