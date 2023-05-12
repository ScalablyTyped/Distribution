organization := "org.scalablytyped"
name := "lumino__widgets"
version := "2.1.1-bfdb9d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "lumino__commands" % "2.1.1-05e88e",
  "org.scalablytyped" %%% "lumino__coreutils" % "2.1.1-0e89ba",
  "org.scalablytyped" %%% "lumino__disposable" % "2.1.1-1b84cf",
  "org.scalablytyped" %%% "lumino__messaging" % "2.0.0-4ed37a",
  "org.scalablytyped" %%% "lumino__signaling" % "2.1.1-1de98e",
  "org.scalablytyped" %%% "lumino__virtualdom" % "2.0.0-584dda",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
