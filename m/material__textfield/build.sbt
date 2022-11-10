organization := "org.scalablytyped"
name := "material__textfield"
version := "14.0.0-bb27cd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-fb3775",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-36cc04",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-89070f",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-0b0587",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-3421ae",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
