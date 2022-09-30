organization := "org.scalablytyped"
name := "jupyterlab__apputils"
version := "3.4.7-319132"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "free-style" % "4.1.0-22db88",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "5.4.7-e936f2",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "3.4.7-6abe39",
  "org.scalablytyped" %%% "jupyterlab__observables" % "4.4.7-b5b795",
  "org.scalablytyped" %%% "jupyterlab__services" % "6.4.7-6a6e79",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "3.4.7-e33aaf",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "3.4.7-16dc12",
  "org.scalablytyped" %%% "jupyterlab__translation" % "3.4.7-f786ea",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "3.4.7-995701",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-b93451",
  "org.scalablytyped" %%% "lumino__commands" % "1.20.1-f4ba85",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-214cfb",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-6c68d7",
  "org.scalablytyped" %%% "lumino__messaging" % "1.10.2-73efa5",
  "org.scalablytyped" %%% "lumino__polling" % "1.11.1-057d04",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-583455",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.14.2-dd3ffe",
  "org.scalablytyped" %%% "lumino__widgets" % "1.34.0-6d24ab",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "typestyle" % "2.4.0-202f99")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
