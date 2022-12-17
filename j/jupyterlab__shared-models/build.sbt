organization := "org.scalablytyped"
name := "jupyterlab__shared-models"
version := "3.5.0-506236"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.5.0-a4504d",
  "org.scalablytyped" %%% "lib0" % "0.2.52-9af3f0",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-931c12",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-8284d8",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-a0e2b2",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-80e7f3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "rollup" % "3.3.0-1c8d6b",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "y-protocols" % "1.0.5-86ce51",
  "org.scalablytyped" %%% "yjs" % "13.5.42-285753")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
