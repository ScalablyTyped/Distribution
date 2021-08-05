organization := "org.scalablytyped"
name := "material__tab-bar"
version := "8.0.0-2161e8"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "8.0.0-06c1b7",
  "org.scalablytyped" %%% "material__ripple" % "8.0.0-e1d930",
  "org.scalablytyped" %%% "material__tab" % "8.0.0-8301a5",
  "org.scalablytyped" %%% "material__tab-indicator" % "8.0.0-e7510f",
  "org.scalablytyped" %%% "material__tab-scroller" % "8.0.0-f50f70",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
