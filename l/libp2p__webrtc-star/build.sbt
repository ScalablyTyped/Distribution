organization := "org.scalablytyped"
name := "libp2p__webrtc-star"
version := "5.0.3-e37254"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-011631",
  "org.scalablytyped" %%% "engine_dot_io-client" % "6.2.3-b97f63",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-984bad",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-52a3a3",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-43f797",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-31ced4",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-f67941",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-22c095",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-dfe155",
  "org.scalablytyped" %%% "libp2p__interface-stream-muxer" % "3.0.0-8e1eaf",
  "org.scalablytyped" %%% "libp2p__interface-transport" % "2.0.0-f7ea95",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-5a062f",
  "org.scalablytyped" %%% "libp2p__logger" % "2.0.2-29e220",
  "org.scalablytyped" %%% "libp2p__webrtc-peer" % "2.0.2-8d36ea",
  "org.scalablytyped" %%% "libp2p__webrtc-star-protocol" % "2.0.1-42dc3e",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-cc7cca",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-93ee03",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "socket_dot_io-client" % "4.5.3-8590ff",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-fda131",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-a999fd",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-bed8fc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
