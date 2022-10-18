organization := "org.scalablytyped"
name := "jupyterlab__docprovider"
version := "3.4.8-1d2ba4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.4.8-482564",
  "org.scalablytyped" %%% "jupyterlab__shared-models" % "3.4.8-9e9bbc",
  "org.scalablytyped" %%% "lib0" % "0.2.52-96b2a4",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-3e1ceb",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-0dc8fb",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-350acb",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-f14e47",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "rollup" % "3.2.3-eed8d7",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "y-protocols" % "1.0.5-5b85c1",
  "org.scalablytyped" %%% "y-websocket" % "1.4.5-e70246",
  "org.scalablytyped" %%% "yjs" % "13.5.41-408f20")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
