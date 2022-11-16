organization := "org.scalablytyped"
name := "material__select"
version := "14.0.0-794624"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-d6291d",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-8c0d1b",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-485933",
  "org.scalablytyped" %%% "material__list" % "14.0.0-7fe922",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-ca20fd",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-7f7844",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-f7cd92",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
