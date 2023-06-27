organization := "org.scalablytyped"
name := "material__tab-bar"
version := "14.0.0-5e7b0b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-b42987",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-94873f",
  "org.scalablytyped" %%% "material__tab" % "14.0.0-c1b0b6",
  "org.scalablytyped" %%% "material__tab-indicator" % "14.0.0-129318",
  "org.scalablytyped" %%% "material__tab-scroller" % "14.0.0-d8f43a",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
