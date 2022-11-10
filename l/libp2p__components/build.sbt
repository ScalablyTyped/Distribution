organization := "org.scalablytyped"
name := "libp2p__components"
version := "2.1.0-f54c09"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-76d703",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-b04ef9",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-ade001",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-78f516",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-d5d4ca",
  "org.scalablytyped" %%% "libp2p__interface-address-manager" % "2.0.0-cb45f2",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-ed0c26",
  "org.scalablytyped" %%% "libp2p__interface-connection-manager" % "1.3.0-4de9fe",
  "org.scalablytyped" %%% "libp2p__interface-content-routing" % "1.0.3-4cf90a",
  "org.scalablytyped" %%% "libp2p__interface-dht" % "1.0.2-a0aa43",
  "org.scalablytyped" %%% "libp2p__interface-metrics" % "3.0.0-32f542",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-ad59cd",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-ba3d3a",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-5f08ec",
  "org.scalablytyped" %%% "libp2p__interface-peer-routing" % "1.0.1-515f44",
  "org.scalablytyped" %%% "libp2p__interface-peer-store" % "1.2.2-922b0a",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "3.0.0-08c91c",
  "org.scalablytyped" %%% "libp2p__interface-record" % "2.0.1-d40858",
  "org.scalablytyped" %%% "libp2p__interface-registrar" % "2.0.3-c9c430",
  "org.scalablytyped" %%% "libp2p__interface-stream-muxer" % "3.0.0-93765a",
  "org.scalablytyped" %%% "libp2p__interface-transport" % "2.0.0-6f5467",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-9299fd",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-ebf5dc",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-446616",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-24328f",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-cf12ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
