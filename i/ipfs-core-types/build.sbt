organization := "org.scalablytyped"
name := "ipfs-core-types"
version := "0.12.1-ff0a82"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-7e747b",
  "org.scalablytyped" %%% "ipfs-unixfs" % "7.0.0-b7daf9",
  "org.scalablytyped" %%% "ipld__dag-pb" % "2.1.18-5f884b",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-db3546",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-2bd2ec",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-788a7b",
  "org.scalablytyped" %%% "libp2p__interface-keychain" % "1.0.3-929ca1",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-122bf3",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-2c5f47",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "2.1.0-e66b09",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-cbc19e",
  "org.scalablytyped" %%% "multiformats" % "10.0.0-e339c8",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.1-9c49c7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.2-45b6fe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
