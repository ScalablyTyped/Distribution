organization := "org.scalablytyped"
name := "material__select"
version := "14.0.0-9c5a17"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-47bd03",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-e364e5",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-afd032",
  "org.scalablytyped" %%% "material__list" % "14.0.0-832da1",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-654c07",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-280771",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-61dc10",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
