organization := "org.scalablytyped"
name := "jupyterlab__apputils"
version := "2.1.1-000616"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "free-style" % "3.1.0-f3083c",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "4.1.0-b84cb8",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "2.1.0-286e04",
  "org.scalablytyped" %%% "jupyterlab__observables" % "3.1.0-f11e6c",
  "org.scalablytyped" %%% "jupyterlab__services" % "5.1.0-967381",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "2.1.0-3c6047",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "2.1.0-e9588a",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "2.1.1-f2f28c",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.2.3-d92c96",
  "org.scalablytyped" %%% "lumino__commands" % "1.10.3-b8fad4",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.4.3-b5fd57",
  "org.scalablytyped" %%% "lumino__disposable" % "1.3.6-fa268a",
  "org.scalablytyped" %%% "lumino__messaging" % "1.3.3-bd0922",
  "org.scalablytyped" %%% "lumino__polling" % "1.2.2-826394",
  "org.scalablytyped" %%% "lumino__signaling" % "1.3.6-d77f45",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.6.1-88200f",
  "org.scalablytyped" %%% "lumino__widgets" % "1.12.2-b65c57",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "typestyle" % "2.1.0-c8ae11")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
