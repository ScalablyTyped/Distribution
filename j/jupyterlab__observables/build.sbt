organization := "org.scalablytyped"
name := "jupyterlab__observables"
version := "4.5.0-1ab86b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-3d1e81",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-8c650c",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-3430c7",
  "org.scalablytyped" %%% "lumino__messaging" % "1.10.3-b7509f",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-a1f071",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
