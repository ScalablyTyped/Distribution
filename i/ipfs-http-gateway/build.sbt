organization := "org.scalablytyped"
name := "ipfs-http-gateway"
version := "0.12.0-1d45ee"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-1d5233",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-895c47",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-b7f2fb",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-d227c2",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-abe48a",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-ea4c5d",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-e71e9e",
  "org.scalablytyped" %%% "ipfs-core-types" % "0.13.0-b5fbaf",
  "org.scalablytyped" %%% "ipfs-unixfs" % "8.0.0-8d9552",
  "org.scalablytyped" %%% "ipld__dag-pb" % "3.0.0-e51193",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-d89a36",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-d3f578",
  "org.scalablytyped" %%% "joi" % "17.7.0-985b45",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-4f1a18",
  "org.scalablytyped" %%% "libp2p__interface-keychain" % "1.0.4-b1a52d",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-7d8c71",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-0bad38",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "3.0.0-fd2b2e",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-03f126",
  "org.scalablytyped" %%% "libp2p__logger" % "2.0.2-f3e9e0",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-04b3d3",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-6e66b6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-d35278")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
