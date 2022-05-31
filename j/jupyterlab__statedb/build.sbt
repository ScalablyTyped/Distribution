organization := "org.scalablytyped"
name := "jupyterlab__statedb"
version := "2.2.5-acf5a7"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.3.3-f7d114",
  "org.scalablytyped" %%% "lumino__commands" % "1.11.4-ca0aaa",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.5.3-c6b4ee",
  "org.scalablytyped" %%% "lumino__disposable" % "1.4.3-bfd119",
  "org.scalablytyped" %%% "lumino__signaling" % "1.4.3-0ab4bb",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.7.3-fbb1df",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
