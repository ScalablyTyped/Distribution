organization := "org.scalablytyped"
name := "libp2p"
version := "0.40.0-ac73b1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "achingbrain__nat-port-mapper" % "1.0.7-a0659f",
  "org.scalablytyped" %%% "achingbrain__ssdp" % "4.0.1-e5b15e",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-1d5233",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-126aa3",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-c00699",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-d89a36",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-d3f578",
  "org.scalablytyped" %%% "libp2p__interface-address-manager" % "2.0.0-29f137",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-4f1a18",
  "org.scalablytyped" %%% "libp2p__interface-connection-encrypter" % "3.0.1-e3acb9",
  "org.scalablytyped" %%% "libp2p__interface-connection-manager" % "1.3.0-304325",
  "org.scalablytyped" %%% "libp2p__interface-content-routing" % "1.0.3-bf079d",
  "org.scalablytyped" %%% "libp2p__interface-dht" % "1.0.2-1ac20d",
  "org.scalablytyped" %%% "libp2p__interface-metrics" % "3.0.0-03bb66",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-810e3c",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-7d8c71",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-0bad38",
  "org.scalablytyped" %%% "libp2p__interface-peer-routing" % "1.0.1-8f390d",
  "org.scalablytyped" %%% "libp2p__interface-peer-store" % "1.2.2-13e8cc",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "3.0.0-fd2b2e",
  "org.scalablytyped" %%% "libp2p__interface-record" % "2.0.1-0d2489",
  "org.scalablytyped" %%% "libp2p__interface-registrar" % "2.0.3-cd6482",
  "org.scalablytyped" %%% "libp2p__interface-stream-muxer" % "3.0.0-c0bdee",
  "org.scalablytyped" %%% "libp2p__interface-transport" % "2.0.0-d22b76",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-03f126",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-04b3d3",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-6e66b6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "p-defer" % "4.0.0-ade05a",
  "org.scalablytyped" %%% "protons-runtime" % "4.0.1-26818f",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "timeout-abort-controller" % "3.0.0-9f2bc1",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-d35278",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-9a5439")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
