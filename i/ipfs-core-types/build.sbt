organization := "org.scalablytyped"
name := "ipfs-core-types"
version := "0.12.1-ab112c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-011631",
  "org.scalablytyped" %%% "ipfs-unixfs" % "7.0.0-aab645",
  "org.scalablytyped" %%% "ipld__dag-pb" % "2.1.18-de94df",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-52a3a3",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-43f797",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-c8b0f1",
  "org.scalablytyped" %%% "libp2p__interface-keychain" % "1.0.3-677c33",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-22cec9",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-c16c2e",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "2.1.0-305919",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-5a062f",
  "org.scalablytyped" %%% "multiformats" % "10.0.0-cc5814",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.1-08d9e6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.2-03d59f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
