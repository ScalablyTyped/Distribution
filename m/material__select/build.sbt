organization := "org.scalablytyped"
name := "material__select"
version := "14.0.0-205a5f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-fb3775",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-36cc04",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-89070f",
  "org.scalablytyped" %%% "material__list" % "14.0.0-2b9878",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-259d3a",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-034af3",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-0b0587",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
