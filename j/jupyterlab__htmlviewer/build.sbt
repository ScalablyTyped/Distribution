organization := "org.scalablytyped"
name := "jupyterlab__htmlviewer"
version := "2.2.6-3705d7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "free-style" % "3.1.0-662f9f",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "2.2.6-5bf481",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "2.2.5-dcc0ef",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "4.2.5-1c2138",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "2.2.4-0de210",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "2.2.5-bdfdd8",
  "org.scalablytyped" %%% "jupyterlab__observables" % "3.2.5-d805cc",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "2.2.4-194136",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "2.2.1-3e1a4a",
  "org.scalablytyped" %%% "jupyterlab__services" % "5.2.5-89cca3",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "2.2.5-88033f",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "2.2.5-4b2871",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "2.2.4-2fab27",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.3.3-6bbf10",
  "org.scalablytyped" %%% "lumino__commands" % "1.11.4-8bc52a",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.5.3-5b541b",
  "org.scalablytyped" %%% "lumino__disposable" % "1.4.3-c29ef2",
  "org.scalablytyped" %%% "lumino__messaging" % "1.4.3-5292d0",
  "org.scalablytyped" %%% "lumino__polling" % "1.3.3-d5760a",
  "org.scalablytyped" %%% "lumino__signaling" % "1.4.3-db0b39",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.7.3-79bff6",
  "org.scalablytyped" %%% "lumino__widgets" % "1.14.1-dfc7b4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "typestyle" % "2.1.0-73a882")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
