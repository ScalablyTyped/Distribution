organization := "org.scalablytyped"
name := "jupyterlab__docprovider"
version := "3.5.0-c24d4d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.5.0-64c18b",
  "org.scalablytyped" %%% "jupyterlab__shared-models" % "3.5.0-d678b2",
  "org.scalablytyped" %%% "lib0" % "0.2.52-ddece1",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-80cc67",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-15389b",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-64d649",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-809a44",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "rollup" % "3.3.0-ebfd9f",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "y-protocols" % "1.0.5-c371b1",
  "org.scalablytyped" %%% "y-websocket" % "1.4.5-3c74d7",
  "org.scalablytyped" %%% "yjs" % "13.5.42-7bcb45")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
