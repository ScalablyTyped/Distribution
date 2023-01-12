organization := "org.scalablytyped"
name := "ipfs-http-gateway"
version := "0.12.0-a4e7a4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-60582a",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-e943fd",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-35b843",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-8d60cc",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-bdfda0",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-e1b709",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-dab5bb",
  "org.scalablytyped" %%% "ipfs-core-types" % "0.13.0-01d346",
  "org.scalablytyped" %%% "ipfs-unixfs" % "8.0.0-59a81e",
  "org.scalablytyped" %%% "ipld__dag-pb" % "3.0.0-38ca72",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-9ef610",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-f6f2e3",
  "org.scalablytyped" %%% "joi" % "17.7.0-c612b4",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-8f57b2",
  "org.scalablytyped" %%% "libp2p__interface-keychain" % "1.0.4-d57258",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-b7cd64",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-dd6cfe",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "3.0.0-e3eaa5",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-0a8bf2",
  "org.scalablytyped" %%% "libp2p__logger" % "2.0.2-f3e9e0",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-dbe0b0",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-cf6b57",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-f85bcb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
