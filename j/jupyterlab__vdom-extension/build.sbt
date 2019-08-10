organization := "org.scalablytyped"
name := "jupyterlab__vdom-extension"
version := "1.0.3-6bf9a6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "jupyterlab__application" % "1.0.3-363b37",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "1.0.3-28e002",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.0.0-6bcff4",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.2.0-5715ac",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.3.0-6a1a4b",
  "org.scalablytyped" %%% "jupyterlab__services" % "4.0.3-f86bab",
  "org.scalablytyped" %%% "jupyterlab__vdom" % "1.0.3-3cc053",
  "org.scalablytyped" %%% "nteract__transform-vdom" % "4.0.2-2d8bf1",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-88b58f",
  "org.scalablytyped" %%% "phosphor__application" % "1.7.0-0ecfb5",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.0-3a806a",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-df57f7",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.0-0d15fa",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-27e712",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.0-4cce89",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-e0bcde",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.0-503993",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190809Z-2d489e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        