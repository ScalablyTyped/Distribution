organization := "org.scalablytyped"
name := "libp2p__webrtc-star-protocol"
version := "2.0.1-57df9d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "engine_dot_io-client" % "6.2.3-c33526",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-5ebbd6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "socket_dot_io-client" % "4.5.3-24005e",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-b088b4",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-4aa18c",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
