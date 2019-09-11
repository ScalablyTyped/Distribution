organization := "org.scalablytyped"
name := "jupyterlab__htmlviewer-extension"
version := "1.1.2-6c79a5"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "jupyterlab__application" % "1.1.2-7f4850",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "1.1.2-706931",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "1.1.0-4d644e",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.1.0-72a313",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "1.1.2-09dd64",
  "org.scalablytyped" %%% "jupyterlab__htmlviewer" % "1.1.2-acd3c2",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.3.0-76dbff",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "1.1.2-8e9b3c",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.4.0-689901",
  "org.scalablytyped" %%% "jupyterlab__services" % "4.1.1-01086e",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-db25ba",
  "org.scalablytyped" %%% "phosphor__application" % "1.7.1-41ac04",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.1-9cbced",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-2e6e2f",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.0-38a9ea",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-a58088",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.0-429f20",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-ca23e6",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.1-91cbef",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-bd378a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-53b9fb",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        