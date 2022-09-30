organization := "org.scalablytyped"
name := "material__tab-bar"
version := "14.0.0-3a740d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-b7cc0b",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-160434",
  "org.scalablytyped" %%% "material__tab" % "14.0.0-d44417",
  "org.scalablytyped" %%% "material__tab-indicator" % "14.0.0-d20571",
  "org.scalablytyped" %%% "material__tab-scroller" % "14.0.0-ff51dc",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
