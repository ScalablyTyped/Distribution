organization := "org.scalablytyped"
name := "jupyterlab__codemirror-extension"
version := "3.4.8-9ca1be"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "free-style" % "4.1.0-4dbf77",
  "org.scalablytyped" %%% "jupyterlab__application" % "3.4.8-a177b1",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "3.4.8-2f3858",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "3.4.8-2dcdc8",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "5.4.8-3c477c",
  "org.scalablytyped" %%% "jupyterlab__docprovider" % "3.4.8-ec9376",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "3.4.8-4be9ad",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.4.8-482564",
  "org.scalablytyped" %%% "jupyterlab__observables" % "4.4.8-bd2f56",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "3.4.8-9fe454",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "3.4.8-71fdc6",
  "org.scalablytyped" %%% "jupyterlab__services" % "6.4.8-f629ba",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "3.4.8-a9ce16",
  "org.scalablytyped" %%% "jupyterlab__shared-models" % "3.4.8-addadb",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "3.4.8-276f60",
  "org.scalablytyped" %%% "jupyterlab__translation" % "3.4.8-4d587e",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "3.4.8-3ebf02",
  "org.scalablytyped" %%% "lib0" % "0.2.52-5f5655",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-3e1ceb",
  "org.scalablytyped" %%% "lumino__application" % "1.29.4-8cae20",
  "org.scalablytyped" %%% "lumino__commands" % "1.20.1-f6d697",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-0dc8fb",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-350acb",
  "org.scalablytyped" %%% "lumino__messaging" % "1.10.3-51bd04",
  "org.scalablytyped" %%% "lumino__polling" % "1.11.2-c83708",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-f14e47",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.14.2-bf27c0",
  "org.scalablytyped" %%% "lumino__widgets" % "1.34.1-4b2902",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "rollup" % "3.2.3-eed8d7",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "typestyle" % "2.4.0-fce9a1",
  "org.scalablytyped" %%% "y-protocols" % "1.0.5-761367",
  "org.scalablytyped" %%% "y-websocket" % "1.4.5-a6e7e1",
  "org.scalablytyped" %%% "yjs" % "13.5.41-dd7764")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
