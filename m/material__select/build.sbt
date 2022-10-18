organization := "org.scalablytyped"
name := "material__select"
version := "14.0.0-0b26cf"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-3fe4c6",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-992249",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-8ce602",
  "org.scalablytyped" %%% "material__list" % "14.0.0-228f83",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-c11132",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-6145dc",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-e92e5e",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
