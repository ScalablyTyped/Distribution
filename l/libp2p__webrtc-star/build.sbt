organization := "org.scalablytyped"
name := "libp2p__webrtc-star"
version := "3.0.3-6c1372"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-011631",
  "org.scalablytyped" %%% "engine_dot_io-client" % "6.2.3-9d1a6c",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-984bad",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-30d461",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-28bc3a",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-52a3a3",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-43f797",
  "org.scalablytyped" %%% "libp2p__components" % "2.1.0-0a1de6",
  "org.scalablytyped" %%% "libp2p__interface-address-manager" % "1.0.3-a88b43",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-c8b0f1",
  "org.scalablytyped" %%% "libp2p__interface-connection-manager" % "1.1.1-3138c8",
  "org.scalablytyped" %%% "libp2p__interface-content-routing" % "1.0.2-57fa5a",
  "org.scalablytyped" %%% "libp2p__interface-dht" % "1.0.1-f85914",
  "org.scalablytyped" %%% "libp2p__interface-metrics" % "3.0.0-60737e",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-2a6d54",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-22cec9",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-c16c2e",
  "org.scalablytyped" %%% "libp2p__interface-peer-routing" % "1.0.1-b53e86",
  "org.scalablytyped" %%% "libp2p__interface-peer-store" % "1.2.2-c2f757",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "2.1.0-305919",
  "org.scalablytyped" %%% "libp2p__interface-record" % "2.0.1-b0ee8b",
  "org.scalablytyped" %%% "libp2p__interface-registrar" % "2.0.3-ee317c",
  "org.scalablytyped" %%% "libp2p__interface-transport" % "1.0.4-a7a20c",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-5a062f",
  "org.scalablytyped" %%% "libp2p__logger" % "2.0.2-29e220",
  "org.scalablytyped" %%% "libp2p__webrtc-peer" % "2.0.0-a1d2a7",
  "org.scalablytyped" %%% "libp2p__webrtc-star-protocol" % "2.0.1-c694bf",
  "org.scalablytyped" %%% "multiformats" % "10.0.0-cc5814",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.1-08d9e6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "socket_dot_io-client" % "4.5.3-1b7058",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-fda131",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-a999fd",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.2-03d59f",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-96764a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
