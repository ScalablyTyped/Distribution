organization := "org.scalablytyped"
name := "libp2p__pubsub"
version := "3.1.2-4cbe9e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-7e747b",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-ebb97c",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-da5dc9",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-7ca61f",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-db3546",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-2bd2ec",
  "org.scalablytyped" %%% "libp2p__components" % "2.1.0-b6d081",
  "org.scalablytyped" %%% "libp2p__interface-address-manager" % "1.0.3-3a2611",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-4bb6a5",
  "org.scalablytyped" %%% "libp2p__interface-connection-manager" % "1.1.1-450360",
  "org.scalablytyped" %%% "libp2p__interface-content-routing" % "1.0.2-117de2",
  "org.scalablytyped" %%% "libp2p__interface-dht" % "1.0.1-09bb90",
  "org.scalablytyped" %%% "libp2p__interface-metrics" % "3.0.0-fa1352",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-c399f6",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-122bf3",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-c3d12b",
  "org.scalablytyped" %%% "libp2p__interface-peer-routing" % "1.0.1-23b38c",
  "org.scalablytyped" %%% "libp2p__interface-peer-store" % "1.2.2-a965be",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "2.1.0-3a1b59",
  "org.scalablytyped" %%% "libp2p__interface-record" % "2.0.1-89b530",
  "org.scalablytyped" %%% "libp2p__interface-registrar" % "2.0.3-5bd3cb",
  "org.scalablytyped" %%% "libp2p__interface-transport" % "1.0.4-971ab7",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-cbc19e",
  "org.scalablytyped" %%% "libp2p__peer-collections" % "2.0.0-709319",
  "org.scalablytyped" %%% "multiformats" % "10.0.0-e339c8",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.1-c9fad1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "p-queue" % "7.3.0-c5a501",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.2-45b6fe",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-caebd5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
