organization := "org.scalablytyped"
name := "jupyterlab__application-extension"
version := "3.5.0-71ddfd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "free-style" % "4.1.0-be974c",
  "org.scalablytyped" %%% "jupyterlab__application" % "3.5.0-35cd4a",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "3.5.0-c8f9ac",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "3.5.0-973baf",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "5.5.0-75f6b2",
  "org.scalablytyped" %%% "jupyterlab__docprovider" % "3.5.0-64f87b",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "3.5.0-1a26b8",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.5.0-70fd98",
  "org.scalablytyped" %%% "jupyterlab__observables" % "4.5.0-25de33",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "3.5.0-b2d128",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "3.5.0-568536",
  "org.scalablytyped" %%% "jupyterlab__services" % "6.5.0-1d78ae",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "3.5.0-9a0015",
  "org.scalablytyped" %%% "jupyterlab__shared-models" % "3.5.0-87197e",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "3.5.0-8c93c0",
  "org.scalablytyped" %%% "jupyterlab__translation" % "3.5.0-9a8702",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "3.5.0-174fc8",
  "org.scalablytyped" %%% "lib0" % "0.2.52-3508a7",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-8eb917",
  "org.scalablytyped" %%% "lumino__application" % "1.29.4-60739e",
  "org.scalablytyped" %%% "lumino__commands" % "1.20.1-c0f796",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-6c186c",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-95b5ad",
  "org.scalablytyped" %%% "lumino__messaging" % "1.10.3-6f793b",
  "org.scalablytyped" %%% "lumino__polling" % "1.11.2-e41266",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-0e4ba5",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.14.2-f07ffa",
  "org.scalablytyped" %%% "lumino__widgets" % "1.34.1-f4a806",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "rollup" % "3.3.0-76f060",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "typestyle" % "2.4.0-5a9bf2",
  "org.scalablytyped" %%% "y-protocols" % "1.0.5-df727f",
  "org.scalablytyped" %%% "y-websocket" % "1.4.5-a06536",
  "org.scalablytyped" %%% "yjs" % "13.5.42-247d0e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
