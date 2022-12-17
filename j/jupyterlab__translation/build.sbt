organization := "org.scalablytyped"
name := "jupyterlab__translation"
version := "3.5.0-85b69b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "5.5.0-d89308",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.5.0-a4504d",
  "org.scalablytyped" %%% "jupyterlab__observables" % "4.5.0-b1670c",
  "org.scalablytyped" %%% "jupyterlab__services" % "6.5.0-b2afee",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "3.5.0-3a83f7",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "3.5.0-c8549f",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-931c12",
  "org.scalablytyped" %%% "lumino__commands" % "1.20.1-3d2436",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-8284d8",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-a0e2b2",
  "org.scalablytyped" %%% "lumino__messaging" % "1.10.3-954b00",
  "org.scalablytyped" %%% "lumino__polling" % "1.11.2-3226ec",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-80e7f3",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.14.2-1d773a",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
