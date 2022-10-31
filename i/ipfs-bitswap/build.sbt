organization := "org.scalablytyped"
name := "ipfs-bitswap"
version := "13.0.0-d0e2a3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "achingbrain__nat-port-mapper" % "1.0.7-e1bbaa",
  "org.scalablytyped" %%% "achingbrain__ssdp" % "4.0.1-66a595",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-6dfedf",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-011631",
  "org.scalablytyped" %%% "events" % "3.0-dt-20211202Z-4cfc23",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.1-8b046d",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-ee1118",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-28bc3a",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-52a3a3",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-43f797",
  "org.scalablytyped" %%% "libp2p" % "0.40.0-6483f9",
  "org.scalablytyped" %%% "libp2p__interface-address-manager" % "2.0.0-029cc6",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-31ced4",
  "org.scalablytyped" %%% "libp2p__interface-connection-encrypter" % "3.0.1-6732de",
  "org.scalablytyped" %%% "libp2p__interface-connection-manager" % "1.3.0-32cfa2",
  "org.scalablytyped" %%% "libp2p__interface-content-routing" % "1.0.3-661a80",
  "org.scalablytyped" %%% "libp2p__interface-dht" % "1.0.2-64e25f",
  "org.scalablytyped" %%% "libp2p__interface-metrics" % "3.0.0-6e4cf0",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-f67941",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-22c095",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-dfe155",
  "org.scalablytyped" %%% "libp2p__interface-peer-routing" % "1.0.1-823ccf",
  "org.scalablytyped" %%% "libp2p__interface-peer-store" % "1.2.2-8598bd",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "3.0.0-7c3762",
  "org.scalablytyped" %%% "libp2p__interface-record" % "2.0.1-9c1936",
  "org.scalablytyped" %%% "libp2p__interface-registrar" % "2.0.3-677084",
  "org.scalablytyped" %%% "libp2p__interface-stream-muxer" % "3.0.0-8e1eaf",
  "org.scalablytyped" %%% "libp2p__interface-transport" % "2.0.0-f7ea95",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-5a062f",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-bb1d3f",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-cc7cca",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-93ee03",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "p-defer" % "4.0.0-de11a3",
  "org.scalablytyped" %%% "protons-runtime" % "4.0.1-0cf32a",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "timeout-abort-controller" % "3.0.0-2e5bd9",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-bed8fc",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-91995b",
  "org.scalablytyped" %%% "vascosantos__moving-average" % "1.1.0-6f3888")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
