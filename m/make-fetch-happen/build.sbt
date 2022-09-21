organization := "org.scalablytyped"
name := "make-fetch-happen"
version := "10.0-dt-20220714Z-ea8c05"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-07bd44",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-876ac5",
  "org.scalablytyped" %%% "retry" % "0.12-dt-20220426Z-d38354",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-4bd69e",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
