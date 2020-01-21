organization := "org.scalablytyped"
name := "jupyterlab__statusbar-extension"
version := "1.2.2-ed9efe"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "jupyterlab__application" % "1.2.1-27a88b",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "1.2.1-9cd56b",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "1.2.0-d93460",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.2.0-cbcfe0",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "1.2.1-5d9a53",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.4.0-bada84",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "1.2.1-66c6b8",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.5.0-500368",
  "org.scalablytyped" %%% "jupyterlab__services" % "4.2.0-bd0114",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-0c3ac5",
  "org.scalablytyped" %%% "phosphor__application" % "1.7.3-7b86b2",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.2-a97230",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-559af0",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.1-4489da",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-d1b800",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.1-e44366",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-edd744",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.3-98ef91",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        