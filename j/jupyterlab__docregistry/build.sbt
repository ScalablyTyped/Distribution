organization := "org.scalablytyped"
name := "jupyterlab__docregistry"
version := "1.2.1-8c5a41"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "1.2.1-31f157",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "1.2.0-99fc81",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.2.0-76682e",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.4.0-fae4ef",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "1.2.1-334e08",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.5.0-0c8be0",
  "org.scalablytyped" %%% "jupyterlab__services" % "4.2.0-8a456f",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-b2c4c6",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.2-fc84a5",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-dfa31a",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.1-b83200",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-ade585",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.1-735c35",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-80d054",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.3-e6c1ee",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        