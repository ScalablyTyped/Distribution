organization := "org.scalablytyped"
name := "libp2p__webrtc-star"
version := "5.0.3-cc87be"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-60582a",
  "org.scalablytyped" %%% "engine_dot_io-client" % "6.2.3-0cad08",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-2f7cdd",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-9ef610",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-f6f2e3",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-8f57b2",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-904d51",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-b7cd64",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-dd6cfe",
  "org.scalablytyped" %%% "libp2p__interface-stream-muxer" % "3.0.0-84b06b",
  "org.scalablytyped" %%% "libp2p__interface-transport" % "2.0.0-4eab9e",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-0a8bf2",
  "org.scalablytyped" %%% "libp2p__logger" % "2.0.2-f3e9e0",
  "org.scalablytyped" %%% "libp2p__webrtc-peer" % "2.0.2-11f35f",
  "org.scalablytyped" %%% "libp2p__webrtc-star-protocol" % "2.0.1-341dd8",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-dbe0b0",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-cf6b57",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "socket_dot_io-client" % "4.5.3-a661b9",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-652824",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-859bca",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-f85bcb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
