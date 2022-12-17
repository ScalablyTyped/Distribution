organization := "org.scalablytyped"
name := "ipfs-http-gateway"
version := "0.12.0-6a12f2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-536636",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-783f73",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-bc591b",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-353fc4",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-998f17",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-31fcc8",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-2f55b3",
  "org.scalablytyped" %%% "ipfs-core-types" % "0.13.0-87a358",
  "org.scalablytyped" %%% "ipfs-unixfs" % "8.0.0-480845",
  "org.scalablytyped" %%% "ipld__dag-pb" % "3.0.0-ef5b6d",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-46ddef",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-afe6ba",
  "org.scalablytyped" %%% "joi" % "17.7.0-7c28f2",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-aa5d91",
  "org.scalablytyped" %%% "libp2p__interface-keychain" % "1.0.4-2a094c",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-981e22",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-4655f4",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "3.0.0-51098b",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-1eba2b",
  "org.scalablytyped" %%% "libp2p__logger" % "2.0.2-f3e9e0",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-27d400",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-1e49a2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-29eebc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
