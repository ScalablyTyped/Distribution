organization := "org.scalablytyped"
name := "material__textfield"
version := "8.0.0-d1f8fb"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "8.0.0-67eb4d",
  "org.scalablytyped" %%% "material__floating-label" % "8.0.0-62f8e3",
  "org.scalablytyped" %%% "material__line-ripple" % "8.0.0-4a9e70",
  "org.scalablytyped" %%% "material__notched-outline" % "8.0.0-df88eb",
  "org.scalablytyped" %%% "material__ripple" % "8.0.0-ffa55a",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
