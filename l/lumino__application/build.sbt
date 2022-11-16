organization := "org.scalablytyped"
name := "lumino__application"
version := "1.29.4-dafbdf"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-f6a502",
  "org.scalablytyped" %%% "lumino__commands" % "1.20.1-44f80d",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-a09767",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-35db4c",
  "org.scalablytyped" %%% "lumino__messaging" % "1.10.3-650474",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-bd4b50",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.14.2-5b284b",
  "org.scalablytyped" %%% "lumino__widgets" % "1.34.1-33e0e3",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
