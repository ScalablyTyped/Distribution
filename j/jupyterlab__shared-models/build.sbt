organization := "org.scalablytyped"
name := "jupyterlab__shared-models"
version := "3.5.0-ebe328"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.5.0-81c40f",
  "org.scalablytyped" %%% "lib0" % "0.2.52-d01f6d",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-f6a502",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-a09767",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-35db4c",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-bd4b50",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "rollup" % "3.3.0-8b6f2a",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "y-protocols" % "1.0.5-e45b2a",
  "org.scalablytyped" %%% "yjs" % "13.5.42-a1b7a2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
