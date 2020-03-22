organization := "org.scalablytyped"
name := "jupyterlab__ui-components-extension"
version := "2.0.0-6960c8"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "jupyterlab__application" % "2.0.0-398202",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "2.0.0-755da9",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "2.0.0-76ca5f",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "4.0.0-9a76f5",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "2.0.0-013482",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "2.0.0-6946d1",
  "org.scalablytyped" %%% "jupyterlab__observables" % "3.0.0-dcab3b",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "2.0.0-3606fa",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "2.0.0-084566",
  "org.scalablytyped" %%% "jupyterlab__services" % "5.0.0-c8e0a8",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "2.0.0-a03456",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "2.0.0-88e5e3",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "2.0.0-1cf8ad",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.2.3-935244",
  "org.scalablytyped" %%% "lumino__application" % "1.8.4-4f0d85",
  "org.scalablytyped" %%% "lumino__commands" % "1.10.1-857d11",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.4.2-dc12c7",
  "org.scalablytyped" %%% "lumino__disposable" % "1.3.5-0b92af",
  "org.scalablytyped" %%% "lumino__messaging" % "1.3.3-8057f4",
  "org.scalablytyped" %%% "lumino__polling" % "1.0.4-c82ab4",
  "org.scalablytyped" %%% "lumino__signaling" % "1.3.5-97c4b4",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.6.1-57e815",
  "org.scalablytyped" %%% "lumino__widgets" % "1.11.1-eab737",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-fc5268",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "typestyle" % "2.0.4-e2d45d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
