organization := "org.scalablytyped"
name := "jupyterlab__imageviewer"
version := "1.0.5-038e99"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "1.0.5-348953",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "1.0.1-a1dd5c",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.0.1-07bde0",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "1.0.5-18b6ec",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.2.0-e3b6c6",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "1.0.5-f017f5",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.3.1-4eaece",
  "org.scalablytyped" %%% "jupyterlab__services" % "4.0.5-940e30",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-969f70",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.0-dc9378",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-61f8c4",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.0-b336a7",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-40e64a",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.0-310d79",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-fea349",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.0-8ea209",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        