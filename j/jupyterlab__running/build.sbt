organization := "org.scalablytyped"
name := "jupyterlab__running"
version := "3.4.7-3e2346"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "free-style" % "4.1.0-54576a",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "3.4.7-ca03f1",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "5.4.7-9860e9",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.4.7-109966",
  "org.scalablytyped" %%% "jupyterlab__observables" % "4.4.7-67170b",
  "org.scalablytyped" %%% "jupyterlab__services" % "6.4.7-04deaa",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "3.4.7-7534ea",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "3.4.7-87a1e6",
  "org.scalablytyped" %%% "jupyterlab__translation" % "3.4.7-fdef73",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "3.4.7-ef61a4",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-dd8127",
  "org.scalablytyped" %%% "lumino__commands" % "1.20.1-cd5d74",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-790638",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-fd8906",
  "org.scalablytyped" %%% "lumino__messaging" % "1.10.2-f5425d",
  "org.scalablytyped" %%% "lumino__polling" % "1.11.1-f23f6d",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-7feb40",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.14.2-87c910",
  "org.scalablytyped" %%% "lumino__widgets" % "1.34.0-16904d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "typestyle" % "2.4.0-1b4cd5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
