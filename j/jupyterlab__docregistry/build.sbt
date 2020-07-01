organization := "org.scalablytyped"
name := "jupyterlab__docregistry"
version := "2.1.2-582a44"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-7dae47",
  "org.scalablytyped" %%% "free-style" % "3.1.0-e74461",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "2.1.1-bad791",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "2.1.1-4e2092",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "4.1.0-3a5dac",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "2.1.0-a2ae01",
  "org.scalablytyped" %%% "jupyterlab__observables" % "3.1.0-53ec16",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "2.1.1-0202f9",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "2.1.0-107779",
  "org.scalablytyped" %%% "jupyterlab__services" % "5.1.0-cc305c",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "2.1.0-43836c",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "2.1.0-878350",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "2.1.1-4be716",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.2.3-8f615e",
  "org.scalablytyped" %%% "lumino__commands" % "1.10.3-211fea",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.4.3-277bff",
  "org.scalablytyped" %%% "lumino__disposable" % "1.3.6-a20907",
  "org.scalablytyped" %%% "lumino__messaging" % "1.3.3-efe1d6",
  "org.scalablytyped" %%% "lumino__polling" % "1.2.2-d26746",
  "org.scalablytyped" %%% "lumino__signaling" % "1.3.6-bd579a",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.6.1-03d3b2",
  "org.scalablytyped" %%% "lumino__widgets" % "1.12.2-eb2db3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-034048",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200624Z-23874e",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "typestyle" % "2.1.0-1bba89")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
