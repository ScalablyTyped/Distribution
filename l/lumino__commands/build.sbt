organization := "org.scalablytyped"
name := "lumino__commands"
version := "1.11.4-99e88d"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.3.3-5e1252",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.5.3-23f033",
  "org.scalablytyped" %%% "lumino__disposable" % "1.4.3-d888b6",
  "org.scalablytyped" %%% "lumino__signaling" % "1.4.3-7b273a",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.7.3-5072cd",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
