organization := "org.scalablytyped"
name := "jupyterlab__logconsole"
version := "3.5.0-0aa7cd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "free-style" % "4.1.0-8b3bde",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "3.5.0-cf31bc",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "5.5.0-c1cac4",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.5.0-81f773",
  "org.scalablytyped" %%% "jupyterlab__observables" % "4.5.0-1ab86b",
  "org.scalablytyped" %%% "jupyterlab__outputarea" % "3.5.0-49d0e1",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "3.5.0-fe65c5",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "3.5.0-437bad",
  "org.scalablytyped" %%% "jupyterlab__services" % "6.5.0-840458",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "3.5.0-9d1f2c",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "3.5.0-a6333c",
  "org.scalablytyped" %%% "jupyterlab__translation" % "3.5.0-68a3e6",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "3.5.0-883b91",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-3d1e81",
  "org.scalablytyped" %%% "lumino__commands" % "1.20.1-fbd872",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-8c650c",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-3430c7",
  "org.scalablytyped" %%% "lumino__messaging" % "1.10.3-b7509f",
  "org.scalablytyped" %%% "lumino__polling" % "1.11.2-bc0530",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-a1f071",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.14.2-f88614",
  "org.scalablytyped" %%% "lumino__widgets" % "1.34.1-c32c29",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221027Z-1a0a13",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "typestyle" % "2.4.0-b099cb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
