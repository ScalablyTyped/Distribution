organization := "org.scalablytyped"
name := "ipfs-bitswap"
version := "12.0.6-709958"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "achingbrain__nat-port-mapper" % "1.0.7-465936",
  "org.scalablytyped" %%% "achingbrain__ssdp" % "4.0.1-0ceb04",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-d881d1",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-7e747b",
  "org.scalablytyped" %%% "events" % "3.0-dt-20211202Z-2d4ac7",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.0-74fa13",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-da5dc9",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-7ca61f",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-db3546",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-2bd2ec",
  "org.scalablytyped" %%% "libp2p" % "0.39.2-711660",
  "org.scalablytyped" %%% "libp2p__components" % "2.1.0-80038a",
  "org.scalablytyped" %%% "libp2p__interface-address-manager" % "1.0.3-6ff442",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-788a7b",
  "org.scalablytyped" %%% "libp2p__interface-connection-encrypter" % "2.0.1-83cc9c",
  "org.scalablytyped" %%% "libp2p__interface-connection-manager" % "1.1.1-95cb20",
  "org.scalablytyped" %%% "libp2p__interface-content-routing" % "1.0.2-eb5d49",
  "org.scalablytyped" %%% "libp2p__interface-dht" % "1.0.1-ace690",
  "org.scalablytyped" %%% "libp2p__interface-metrics" % "3.0.0-fa1352",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-292e70",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-122bf3",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-2c5f47",
  "org.scalablytyped" %%% "libp2p__interface-peer-routing" % "1.0.1-7d30ee",
  "org.scalablytyped" %%% "libp2p__interface-peer-store" % "1.2.2-27beec",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "2.1.0-e66b09",
  "org.scalablytyped" %%% "libp2p__interface-record" % "2.0.1-89b530",
  "org.scalablytyped" %%% "libp2p__interface-registrar" % "2.0.3-8ea8b1",
  "org.scalablytyped" %%% "libp2p__interface-stream-muxer" % "2.0.2-842bdd",
  "org.scalablytyped" %%% "libp2p__interface-transport" % "1.0.4-0a9467",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-cbc19e",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "multiformats" % "10.0.0-e339c8",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.1-9c49c7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "p-defer" % "4.0.0-00b7de",
  "org.scalablytyped" %%% "protons-runtime" % "3.1.0-6a8691",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "timeout-abort-controller" % "3.0.0-d974fd",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.2-45b6fe",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-caebd5",
  "org.scalablytyped" %%% "vascosantos__moving-average" % "1.1.0-15cba9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
