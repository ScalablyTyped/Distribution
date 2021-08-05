organization := "org.scalablytyped"
name := "material__menu"
version := "8.0.0-5c364d"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "8.0.0-06c1b7",
  "org.scalablytyped" %%% "material__list" % "8.0.0-9cb81c",
  "org.scalablytyped" %%% "material__menu-surface" % "8.0.0-90afd2",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
