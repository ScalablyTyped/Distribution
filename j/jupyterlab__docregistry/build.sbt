organization := "org.scalablytyped"
name := "jupyterlab__docregistry"
version := "0.19.1-9818e7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "0.19.1-035174",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "2.2.1-1df345",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.1.1-ea9103",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "0.19.1-d06d69",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.2.1-410bbf",
  "org.scalablytyped" %%% "jupyterlab__services" % "3.2.1-fde99e",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-6b8368",
  "org.scalablytyped" %%% "phosphor__commands" % "1.6.1-988dda",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-e30cce",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-f3e18f",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.2.2-9088d7",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-388c7f",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.1.2-e51603",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.6.0-2a92c1",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190619Z-8d8143",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        