organization := "org.scalablytyped"
name := "jupyterlab__docmanager"
version := "0.19.1-ca3aec"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-3bfbc5",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "0.19.1-a6deaa",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "2.2.1-5e4735",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "0.19.1-4b2103",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.1.1-049de8",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "0.19.1-a8ada0",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.2.1-22ed29",
  "org.scalablytyped" %%% "jupyterlab__services" % "3.2.1-ba3073",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-cda69c",
  "org.scalablytyped" %%% "phosphor__commands" % "1.6.1-db391a",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-643ad4",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-6bf0f7",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.2.2-d94faf",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-55aa1a",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.1.2-013d85",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.6.0-9c7ad0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-4b3bf2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-62c565",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        