organization := "org.scalablytyped"
name := "jupyterlab__settingregistry"
version := "3.4.8-a9ce16"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "3.4.8-276f60",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-3e1ceb",
  "org.scalablytyped" %%% "lumino__commands" % "1.20.1-f6d697",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-0dc8fb",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-350acb",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-f14e47",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.14.2-bf27c0",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
