organization := "org.scalablytyped"
name := "jupyterlab__shared-models"
version := "3.5.0-87197e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.5.0-70fd98",
  "org.scalablytyped" %%% "lib0" % "0.2.52-3508a7",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-8eb917",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-6c186c",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-95b5ad",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-0e4ba5",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "rollup" % "3.3.0-76f060",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "y-protocols" % "1.0.5-df727f",
  "org.scalablytyped" %%% "yjs" % "13.5.42-247d0e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
