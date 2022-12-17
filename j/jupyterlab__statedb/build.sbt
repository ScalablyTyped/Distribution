organization := "org.scalablytyped"
name := "jupyterlab__statedb"
version := "3.5.0-c8549f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-931c12",
  "org.scalablytyped" %%% "lumino__commands" % "1.20.1-3d2436",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-8284d8",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-a0e2b2",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-80e7f3",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.14.2-1d773a",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
