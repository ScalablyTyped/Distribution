organization := "org.scalablytyped"
name := "libp2p__components"
version := "2.1.0-70db17"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-536636",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-25c05a",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-0a0540",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-46ddef",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-afe6ba",
  "org.scalablytyped" %%% "libp2p__interface-address-manager" % "2.0.0-be605f",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-aa5d91",
  "org.scalablytyped" %%% "libp2p__interface-connection-manager" % "1.3.0-55dd21",
  "org.scalablytyped" %%% "libp2p__interface-content-routing" % "1.0.3-045ad5",
  "org.scalablytyped" %%% "libp2p__interface-dht" % "1.0.2-bdd3f8",
  "org.scalablytyped" %%% "libp2p__interface-metrics" % "3.0.0-01608b",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-8ac3b8",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-981e22",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-4655f4",
  "org.scalablytyped" %%% "libp2p__interface-peer-routing" % "1.0.1-d24e4a",
  "org.scalablytyped" %%% "libp2p__interface-peer-store" % "1.2.2-dc1420",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "3.0.0-51098b",
  "org.scalablytyped" %%% "libp2p__interface-record" % "2.0.1-63edaa",
  "org.scalablytyped" %%% "libp2p__interface-registrar" % "2.0.3-5c41ea",
  "org.scalablytyped" %%% "libp2p__interface-stream-muxer" % "3.0.0-0941a7",
  "org.scalablytyped" %%% "libp2p__interface-transport" % "2.0.0-4aa0a5",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-1eba2b",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-27d400",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-1e49a2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-29eebc",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-0850c3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
