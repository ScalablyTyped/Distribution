organization := "org.scalablytyped"
name := "libp2p__webrtc-star"
version := "5.0.3-c6e098"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-536636",
  "org.scalablytyped" %%% "engine_dot_io-client" % "6.2.3-3820ae",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-7592f4",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-46ddef",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-afe6ba",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-aa5d91",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-8ac3b8",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-981e22",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-4655f4",
  "org.scalablytyped" %%% "libp2p__interface-stream-muxer" % "3.0.0-0941a7",
  "org.scalablytyped" %%% "libp2p__interface-transport" % "2.0.0-4aa0a5",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-1eba2b",
  "org.scalablytyped" %%% "libp2p__logger" % "2.0.2-f3e9e0",
  "org.scalablytyped" %%% "libp2p__webrtc-peer" % "2.0.2-03001d",
  "org.scalablytyped" %%% "libp2p__webrtc-star-protocol" % "2.0.1-4e5e6d",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-27d400",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-1e49a2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "socket_dot_io-client" % "4.5.3-cc8a2a",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-272d95",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-f95008",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-29eebc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
