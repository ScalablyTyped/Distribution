organization := "org.scalablytyped"
name := "material__tab"
version := "14.0.0-f4bae2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-d53a60",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-139341",
  "org.scalablytyped" %%% "material__tab-indicator" % "14.0.0-c4097c",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
