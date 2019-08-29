organization := "org.scalablytyped"
name := "jupyterlab__completer-extension"
version := "1.1.0-76fa01"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "jupyterlab__application" % "1.1.0-5df28c",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "1.1.0-2d73d9",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "1.1.0-c998bd",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.1.0-181045",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "1.1.0-e496cd",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.3.0-76dbff",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "1.1.0-8a9fbd",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.4.0-7233fd",
  "org.scalablytyped" %%% "jupyterlab__services" % "4.1.0-82f661",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-db25ba",
  "org.scalablytyped" %%% "phosphor__application" % "1.7.0-553e7f",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.0-090f7b",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-2e6e2f",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.0-38a9ea",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-a58088",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.0-429f20",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-ca23e6",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.0-b21f1a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-fd4af0",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-6dcbc8",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        