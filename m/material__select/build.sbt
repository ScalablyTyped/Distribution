organization := "org.scalablytyped"
name := "material__select"
version := "14.0.0-856012"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-e5693b",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-09fcf2",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-22e100",
  "org.scalablytyped" %%% "material__list" % "14.0.0-6d5a58",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-995d74",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-c35780",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-7f9e35",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
