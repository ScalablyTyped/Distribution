organization := "org.scalablytyped"
name := "material__tab-bar"
version := "14.0.0-6a8503"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-e5693b",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-dfbf52",
  "org.scalablytyped" %%% "material__tab" % "14.0.0-b8bb55",
  "org.scalablytyped" %%% "material__tab-indicator" % "14.0.0-5e5110",
  "org.scalablytyped" %%% "material__tab-scroller" % "14.0.0-92a5c4",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
