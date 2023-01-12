organization := "org.scalablytyped"
name := "material__select"
version := "14.0.0-f64891"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-8c8aee",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-79aac5",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-a4d14b",
  "org.scalablytyped" %%% "material__list" % "14.0.0-bbb30e",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-7c3640",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-8f16cf",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-2df2f7",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
