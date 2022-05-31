organization := "org.scalablytyped"
name := "material__select"
version := "8.0.0-23f368"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "8.0.0-9f15fe",
  "org.scalablytyped" %%% "material__floating-label" % "8.0.0-b3d038",
  "org.scalablytyped" %%% "material__line-ripple" % "8.0.0-54f4e0",
  "org.scalablytyped" %%% "material__list" % "8.0.0-f160ef",
  "org.scalablytyped" %%% "material__menu" % "8.0.0-9fb04b",
  "org.scalablytyped" %%% "material__menu-surface" % "8.0.0-292a27",
  "org.scalablytyped" %%% "material__notched-outline" % "8.0.0-ef1df7",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
