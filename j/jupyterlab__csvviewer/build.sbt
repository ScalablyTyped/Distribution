organization := "org.scalablytyped"
name := "jupyterlab__csvviewer"
version := "3.5.0-3bdb33"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "free-style" % "4.1.0-3c395e",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "3.5.0-6b243d",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "3.5.0-bc6dca",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "5.5.0-5ff483",
  "org.scalablytyped" %%% "jupyterlab__docprovider" % "3.5.0-c24d4d",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "3.5.0-56f99e",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.5.0-64c18b",
  "org.scalablytyped" %%% "jupyterlab__observables" % "4.5.0-3dc0bf",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "3.5.0-7f9053",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "3.5.0-50fcce",
  "org.scalablytyped" %%% "jupyterlab__services" % "6.5.0-a5bdbc",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "3.5.0-7ed41a",
  "org.scalablytyped" %%% "jupyterlab__shared-models" % "3.5.0-d678b2",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "3.5.0-6e6b75",
  "org.scalablytyped" %%% "jupyterlab__translation" % "3.5.0-95d5f4",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "3.5.0-55bdab",
  "org.scalablytyped" %%% "lib0" % "0.2.52-ddece1",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-80cc67",
  "org.scalablytyped" %%% "lumino__commands" % "1.20.1-d6dc58",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-15389b",
  "org.scalablytyped" %%% "lumino__datagrid" % "0.36.4-64e38a",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-64d649",
  "org.scalablytyped" %%% "lumino__messaging" % "1.10.3-0c7391",
  "org.scalablytyped" %%% "lumino__polling" % "1.11.2-f2a041",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-809a44",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.14.2-408506",
  "org.scalablytyped" %%% "lumino__widgets" % "1.34.1-be1f28",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "rollup" % "3.3.0-ebfd9f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "typestyle" % "2.4.0-b58db2",
  "org.scalablytyped" %%% "y-protocols" % "1.0.5-c371b1",
  "org.scalablytyped" %%% "y-websocket" % "1.4.5-3c74d7",
  "org.scalablytyped" %%% "yjs" % "13.5.42-7bcb45")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
