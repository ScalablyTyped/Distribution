organization := "org.scalablytyped"
name := "libp2p"
version := "0.45.0-06939e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "any-signal" % "4.1.1-e8573b",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.1-33129a",
  "org.scalablytyped" %%% "eventemitter3" % "5.0.1-abf8ed",
  "org.scalablytyped" %%% "interface-datastore" % "8.2.0-70429c",
  "org.scalablytyped" %%% "interface-store" % "5.1.0-a4fb4a",
  "org.scalablytyped" %%% "it-length-prefixed" % "9.0.1-11184e",
  "org.scalablytyped" %%% "it-pb-stream" % "4.0.1-2af80f",
  "org.scalablytyped" %%% "it-pushable" % "3.1.3-f4a351",
  "org.scalablytyped" %%% "it-reader" % "6.0.4-11b9dd",
  "org.scalablytyped" %%% "it-stream-types" % "2.0.1-0d2408",
  "org.scalablytyped" %%% "libp2p__interface-address-manager" % "3.0.1-75c331",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "5.0.2-780089",
  "org.scalablytyped" %%% "libp2p__interface-connection-encrypter" % "4.0.1-c8d6d5",
  "org.scalablytyped" %%% "libp2p__interface-connection-gater" % "3.0.1-e7346f",
  "org.scalablytyped" %%% "libp2p__interface-connection-manager" % "3.0.1-0fce8a",
  "org.scalablytyped" %%% "libp2p__interface-content-routing" % "2.1.1-ba4d92",
  "org.scalablytyped" %%% "libp2p__interface-keychain" % "2.0.5-18c1aa",
  "org.scalablytyped" %%% "libp2p__interface-libp2p" % "3.1.0-be31b4",
  "org.scalablytyped" %%% "libp2p__interface-metrics" % "4.0.8-876663",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "2.0.0-05cd38",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "2.0.2-3b3a0e",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.10-dedcab",
  "org.scalablytyped" %%% "libp2p__interface-peer-routing" % "1.1.1-8fdb61",
  "org.scalablytyped" %%% "libp2p__interface-peer-store" % "2.0.3-1ac974",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "4.0.1-092f23",
  "org.scalablytyped" %%% "libp2p__interface-record" % "2.0.7-14067d",
  "org.scalablytyped" %%% "libp2p__interface-registrar" % "2.0.12-812af1",
  "org.scalablytyped" %%% "libp2p__interface-stream-muxer" % "4.0.1-3e495f",
  "org.scalablytyped" %%% "libp2p__interface-transport" % "4.0.2-906e70",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.3.2-e477a0",
  "org.scalablytyped" %%% "libp2p__keychain" % "2.0.0-81017f",
  "org.scalablytyped" %%% "libp2p__peer-collections" % "3.0.1-11a082",
  "org.scalablytyped" %%% "libp2p__peer-store" % "8.1.2-8ae06d",
  "org.scalablytyped" %%% "mortice" % "3.0.1-e04e2e",
  "org.scalablytyped" %%% "multiformats" % "11.0.2-8d8a57",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "12.1.2-8f78ef",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "p-queue" % "7.3.4-1dc14f",
  "org.scalablytyped" %%% "protons-runtime" % "5.0.0-2c8611",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "uint8arraylist" % "2.4.3-95c018",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.3-07439c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
