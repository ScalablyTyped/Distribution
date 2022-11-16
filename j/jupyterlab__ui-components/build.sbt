organization := "org.scalablytyped"
name := "jupyterlab__ui-components"
version := "3.5.0-00aad6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "free-style" % "4.1.0-ffea94",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "5.5.0-1cb252",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.5.0-81c40f",
  "org.scalablytyped" %%% "jupyterlab__observables" % "4.5.0-adabe6",
  "org.scalablytyped" %%% "jupyterlab__services" % "6.5.0-7f7967",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "3.5.0-294e56",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "3.5.0-d9a3af",
  "org.scalablytyped" %%% "jupyterlab__translation" % "3.5.0-889269",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-f6a502",
  "org.scalablytyped" %%% "lumino__commands" % "1.20.1-44f80d",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-a09767",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-35db4c",
  "org.scalablytyped" %%% "lumino__messaging" % "1.10.3-650474",
  "org.scalablytyped" %%% "lumino__polling" % "1.11.2-4a0ff0",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-bd4b50",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.14.2-5b284b",
  "org.scalablytyped" %%% "lumino__widgets" % "1.34.1-33e0e3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "typestyle" % "2.4.0-8c6400")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
