organization := "org.scalablytyped"
name := "jupyterlab__settingregistry"
version := "3.4.7-e33aaf"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "3.4.7-16dc12",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-b93451",
  "org.scalablytyped" %%% "lumino__commands" % "1.20.1-f4ba85",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-214cfb",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-6c68d7",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-583455",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.14.2-dd3ffe",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
