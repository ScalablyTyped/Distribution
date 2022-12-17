organization := "org.scalablytyped"
name := "lumino__dragdrop"
version := "1.14.2-7e4333"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-931c12",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-8284d8",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-a0e2b2",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-80e7f3",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
