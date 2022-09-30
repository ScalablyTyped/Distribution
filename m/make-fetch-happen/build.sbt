organization := "org.scalablytyped"
name := "make-fetch-happen"
version := "10.0-dt-20220714Z-68f9d3"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-bbb0dd",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-8eede4",
  "org.scalablytyped" %%% "retry" % "0.12-dt-20220426Z-db9e1f",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-e8d31c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
