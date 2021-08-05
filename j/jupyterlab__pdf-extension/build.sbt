organization := "org.scalablytyped"
name := "jupyterlab__pdf-extension"
version := "2.2.1-c6f328"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "2.2.1-20244b",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.3.3-e8076c",
  "org.scalablytyped" %%% "lumino__commands" % "1.11.4-9c0a03",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.5.3-54261f",
  "org.scalablytyped" %%% "lumino__disposable" % "1.4.3-b20b58",
  "org.scalablytyped" %%% "lumino__messaging" % "1.4.3-3dc871",
  "org.scalablytyped" %%% "lumino__signaling" % "1.4.3-2ac2f3",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.7.3-c16e08",
  "org.scalablytyped" %%% "lumino__widgets" % "1.14.1-bdde0b",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
