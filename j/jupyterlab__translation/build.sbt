organization := "org.scalablytyped"
name := "jupyterlab__translation"
version := "3.4.8-4d587e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "5.4.8-3c477c",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.4.8-482564",
  "org.scalablytyped" %%% "jupyterlab__observables" % "4.4.8-bd2f56",
  "org.scalablytyped" %%% "jupyterlab__services" % "6.4.8-f629ba",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "3.4.8-a9ce16",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "3.4.8-276f60",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-3e1ceb",
  "org.scalablytyped" %%% "lumino__commands" % "1.20.1-f6d697",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-0dc8fb",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-350acb",
  "org.scalablytyped" %%% "lumino__messaging" % "1.10.3-51bd04",
  "org.scalablytyped" %%% "lumino__polling" % "1.11.2-c83708",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-f14e47",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.14.2-bf27c0",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
