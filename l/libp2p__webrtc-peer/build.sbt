organization := "org.scalablytyped"
name := "libp2p__webrtc-peer"
version := "2.0.0-41ef12"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-3a5b28",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-255b07",
  "org.scalablytyped" %%% "libp2p__logger" % "2.0.1-153927",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
