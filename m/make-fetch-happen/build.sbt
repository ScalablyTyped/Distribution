organization := "org.scalablytyped"
name := "make-fetch-happen"
version := "10.0-dt-20221126Z-dc4353"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-534907",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "node-fetch" % "3.3.1-2bc985",
  "org.scalablytyped" %%% "retry" % "0.12-dt-20220426Z-104726",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-48f599",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
