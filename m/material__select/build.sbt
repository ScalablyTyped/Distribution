organization := "org.scalablytyped"
name := "material__select"
version := "14.0.0-a46384"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-b42987",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-b00c3a",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-893d11",
  "org.scalablytyped" %%% "material__list" % "14.0.0-74b546",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-784809",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-10b3bc",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-644c81",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
