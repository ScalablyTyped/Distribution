organization := "org.scalablytyped"
name := "libp2p__webrtc-star"
version := "5.0.3-e55f44"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-1d5233",
  "org.scalablytyped" %%% "engine_dot_io-client" % "6.2.3-8343d5",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-39f713",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-d89a36",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-d3f578",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-4f1a18",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-810e3c",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-7d8c71",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-0bad38",
  "org.scalablytyped" %%% "libp2p__interface-stream-muxer" % "3.0.0-c0bdee",
  "org.scalablytyped" %%% "libp2p__interface-transport" % "2.0.0-d22b76",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-03f126",
  "org.scalablytyped" %%% "libp2p__logger" % "2.0.2-f3e9e0",
  "org.scalablytyped" %%% "libp2p__webrtc-peer" % "2.0.2-a8d3c6",
  "org.scalablytyped" %%% "libp2p__webrtc-star-protocol" % "2.0.1-1bc7e9",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-04b3d3",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-6e66b6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "socket_dot_io-client" % "4.5.3-9f5108",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-2d4e1f",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-02cf62",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-d35278")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
