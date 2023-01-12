organization := "org.scalablytyped"
name := "material__tab-bar"
version := "14.0.0-ae8fa7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-8c8aee",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-034b0d",
  "org.scalablytyped" %%% "material__tab" % "14.0.0-448cc7",
  "org.scalablytyped" %%% "material__tab-indicator" % "14.0.0-b92698",
  "org.scalablytyped" %%% "material__tab-scroller" % "14.0.0-81cd54",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
