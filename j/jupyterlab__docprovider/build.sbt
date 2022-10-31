organization := "org.scalablytyped"
name := "jupyterlab__docprovider"
version := "3.5.0-c0ca11"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.5.0-81f773",
  "org.scalablytyped" %%% "jupyterlab__shared-models" % "3.5.0-c29815",
  "org.scalablytyped" %%% "lib0" % "0.2.52-7eeebd",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-3d1e81",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-8c650c",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-3430c7",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-a1f071",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "rollup" % "3.2.3-c92d63",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "y-protocols" % "1.0.5-ff9c29",
  "org.scalablytyped" %%% "y-websocket" % "1.4.5-76797f",
  "org.scalablytyped" %%% "yjs" % "13.5.42-ab45f0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
