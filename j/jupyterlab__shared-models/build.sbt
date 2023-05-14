organization := "org.scalablytyped"
name := "jupyterlab__shared-models"
version := "3.6.3-1d5c6a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jupyter__ydoc" % "1.0.2-ed5602",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.6.3-ed7867",
  "org.scalablytyped" %%% "lib0" % "0.2.74-a95ff3",
  "org.scalablytyped" %%% "lumino__coreutils" % "2.1.1-0e89ba",
  "org.scalablytyped" %%% "lumino__disposable" % "2.1.1-1b84cf",
  "org.scalablytyped" %%% "lumino__signaling" % "2.1.1-1de98e",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "y-protocols" % "1.0.5-09d1a0",
  "org.scalablytyped" %%% "yjs" % "13.6.1-01b84b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
