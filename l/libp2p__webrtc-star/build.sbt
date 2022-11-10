organization := "org.scalablytyped"
name := "libp2p__webrtc-star"
version := "5.0.3-67032d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-76d703",
  "org.scalablytyped" %%% "engine_dot_io-client" % "6.2.3-c33526",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-5ebbd6",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-78f516",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-d5d4ca",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-ed0c26",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-ad59cd",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-ba3d3a",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-5f08ec",
  "org.scalablytyped" %%% "libp2p__interface-stream-muxer" % "3.0.0-93765a",
  "org.scalablytyped" %%% "libp2p__interface-transport" % "2.0.0-6f5467",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-9299fd",
  "org.scalablytyped" %%% "libp2p__logger" % "2.0.2-29e220",
  "org.scalablytyped" %%% "libp2p__webrtc-peer" % "2.0.2-ff3544",
  "org.scalablytyped" %%% "libp2p__webrtc-star-protocol" % "2.0.1-57df9d",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-ebf5dc",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-446616",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "socket_dot_io-client" % "4.5.3-24005e",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-b088b4",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-4aa18c",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-24328f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
