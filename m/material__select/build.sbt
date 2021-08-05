organization := "org.scalablytyped"
name := "material__select"
version := "8.0.0-04b5a4"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "8.0.0-06c1b7",
  "org.scalablytyped" %%% "material__floating-label" % "8.0.0-607bb8",
  "org.scalablytyped" %%% "material__line-ripple" % "8.0.0-1e9edf",
  "org.scalablytyped" %%% "material__list" % "8.0.0-9cb81c",
  "org.scalablytyped" %%% "material__menu" % "8.0.0-5c364d",
  "org.scalablytyped" %%% "material__menu-surface" % "8.0.0-90afd2",
  "org.scalablytyped" %%% "material__notched-outline" % "8.0.0-7d13ce",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
