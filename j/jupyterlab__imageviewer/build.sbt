organization := "org.scalablytyped"
name := "jupyterlab__imageviewer"
version := "1.0.5-463368"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f01b27",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "1.0.5-853de9",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "1.0.1-f5914e",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.0.1-6c8958",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "1.0.5-e60dd7",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.2.0-7af119",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "1.0.5-6d7370",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.3.1-5acbd2",
  "org.scalablytyped" %%% "jupyterlab__services" % "4.0.5-4aa738",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-d56d5f",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.0-33b011",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-cbfd04",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.0-3cd291",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-9b3885",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.0-315994",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-bcf5a1",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.0-a001a4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-93079a",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        