organization := "org.scalablytyped"
name := "material__tab-bar"
version := "8.0.0-86ed0a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "8.0.0-67eb4d",
  "org.scalablytyped" %%% "material__ripple" % "8.0.0-ffa55a",
  "org.scalablytyped" %%% "material__tab" % "8.0.0-b389af",
  "org.scalablytyped" %%% "material__tab-indicator" % "8.0.0-1a96bc",
  "org.scalablytyped" %%% "material__tab-scroller" % "8.0.0-26ca20",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
