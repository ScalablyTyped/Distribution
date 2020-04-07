organization := "org.scalablytyped"
name := "jupyterlab__property-inspector"
version := "2.0.2-8f740b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "jupyterlab__application" % "2.0.2-790501",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "2.0.2-bc4656",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "2.0.2-9c99d5",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "4.0.2-5aeb71",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "2.0.2-8e1260",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "2.0.1-03f5a6",
  "org.scalablytyped" %%% "jupyterlab__observables" % "3.0.1-09bcc0",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "2.0.2-8edef0",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "2.0.1-10e0ba",
  "org.scalablytyped" %%% "jupyterlab__services" % "5.0.2-196ee4",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "2.0.1-608156",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "2.0.1-eadf5c",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "2.0.2-588ef3",
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
  "org.scalablytyped" %%% "react" % "16.9-dt-20200320Z-629467",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "typestyle" % "2.0.4-42dabd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
