organization := "org.scalablytyped"
name := "jupyterlab__services"
version := "6.6.3-df59eb"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "5.6.3-a85304",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.6.3-ed7867",
  "org.scalablytyped" %%% "jupyterlab__observables" % "4.6.3-6e01b0",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "3.6.3-7a1a07",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "3.6.3-d3852c",
  "org.scalablytyped" %%% "lumino__commands" % "2.1.1-05e88e",
  "org.scalablytyped" %%% "lumino__coreutils" % "2.1.1-0e89ba",
  "org.scalablytyped" %%% "lumino__disposable" % "2.1.1-1b84cf",
  "org.scalablytyped" %%% "lumino__messaging" % "2.0.0-4ed37a",
  "org.scalablytyped" %%% "lumino__polling" % "2.1.1-b637ba",
  "org.scalablytyped" %%% "lumino__signaling" % "2.1.1-1de98e",
  "org.scalablytyped" %%% "lumino__virtualdom" % "2.0.0-584dda",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
