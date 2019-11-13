organization := "org.scalablytyped"
name := "jupyterlab__fileeditor-extension"
version := "1.2.2-a05bf7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "jupyterlab__application" % "1.2.1-5453bb",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "1.2.1-45c609",
  "org.scalablytyped" %%% "jupyterlab__attachments" % "1.2.1-69d0f2",
  "org.scalablytyped" %%% "jupyterlab__cells" % "1.2.2-6843c3",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "1.2.0-6eaed4",
  "org.scalablytyped" %%% "jupyterlab__console" % "1.2.2-650b2a",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.2.0-f3cdd1",
  "org.scalablytyped" %%% "jupyterlab__docmanager" % "1.2.1-97f179",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "1.2.1-9d62a3",
  "org.scalablytyped" %%% "jupyterlab__filebrowser" % "1.2.1-d52c06",
  "org.scalablytyped" %%% "jupyterlab__fileeditor" % "1.2.1-6cd075",
  "org.scalablytyped" %%% "jupyterlab__launcher" % "1.2.1-5c623b",
  "org.scalablytyped" %%% "jupyterlab__mainmenu" % "1.2.1-e9ec28",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.4.0-43843a",
  "org.scalablytyped" %%% "jupyterlab__outputarea" % "1.2.2-b09776",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "1.2.1-246d92",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.5.0-3243c2",
  "org.scalablytyped" %%% "jupyterlab__services" % "4.2.0-ba16eb",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "1.2.1-3938f7",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-64f755",
  "org.scalablytyped" %%% "phosphor__application" % "1.7.3-94a74c",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.2-d6a857",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-94a0c4",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.1-b5ce53",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-4a260b",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.1-fc1902",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-b6f64a",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.3-8e0e80",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-132fef",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "typestyle" % "2.0.4-70af35")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        