organization := "org.scalablytyped"
name := "jupyterlab__launcher-extension"
version := "1.1.3-34b275"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "jupyterlab__application" % "1.1.3-e3905e",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "1.1.3-a7f7f2",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "1.1.0-a92997",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.1.0-72a313",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "1.1.3-c3c808",
  "org.scalablytyped" %%% "jupyterlab__launcher" % "1.1.3-39744f",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.3.0-76dbff",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "1.1.3-4b21a0",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.4.0-8f253c",
  "org.scalablytyped" %%% "jupyterlab__services" % "4.1.1-01086e",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-db25ba",
  "org.scalablytyped" %%% "phosphor__application" % "1.7.2-39caef",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.1-9cbced",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-2e6e2f",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.0-38a9ea",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-a58088",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.0-429f20",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-ca23e6",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.2-a7f9a2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-bd378a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190917Z-53b9fb",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        