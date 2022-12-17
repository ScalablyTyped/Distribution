organization := "org.scalablytyped"
name := "material__select"
version := "14.0.0-0c3f03"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-6f911e",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-77fe35",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-6eabb0",
  "org.scalablytyped" %%% "material__list" % "14.0.0-2d5979",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-0d0d4a",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-b64bd0",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-3a7c30",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
