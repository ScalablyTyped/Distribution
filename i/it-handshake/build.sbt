organization := "org.scalablytyped"
name := "it-handshake"
version := "4.1.2-019ca8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-78f516",
  "org.scalablytyped" %%% "it-reader" % "6.0.1-d22772",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-d5d4ca",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-24328f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
