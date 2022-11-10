organization := "org.scalablytyped"
name := "jupyterlab__settingregistry"
version := "3.5.0-7ed41a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "3.5.0-6e6b75",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-80cc67",
  "org.scalablytyped" %%% "lumino__commands" % "1.20.1-d6dc58",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-15389b",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-64d649",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-809a44",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.14.2-408506",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
