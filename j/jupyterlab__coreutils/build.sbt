organization := "org.scalablytyped"
name := "jupyterlab__coreutils"
version := "5.4.7-9860e9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-dd8127",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-790638",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-fd8906",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-7feb40",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
