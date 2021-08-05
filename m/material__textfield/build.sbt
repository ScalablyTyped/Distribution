organization := "org.scalablytyped"
name := "material__textfield"
version := "8.0.0-f8b2b7"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "8.0.0-06c1b7",
  "org.scalablytyped" %%% "material__floating-label" % "8.0.0-607bb8",
  "org.scalablytyped" %%% "material__line-ripple" % "8.0.0-1e9edf",
  "org.scalablytyped" %%% "material__notched-outline" % "8.0.0-7d13ce",
  "org.scalablytyped" %%% "material__ripple" % "8.0.0-e1d930",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
