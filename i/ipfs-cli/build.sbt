organization := "org.scalablytyped"
name := "ipfs-cli"
version := "0.15.0-984ba1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-76d703",
  "org.scalablytyped" %%% "ipfs-core-types" % "0.13.0-fadfb8",
  "org.scalablytyped" %%% "ipfs-unixfs" % "8.0.0-663d98",
  "org.scalablytyped" %%% "ipld__dag-pb" % "3.0.0-b536ce",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-78f516",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-d5d4ca",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-ed0c26",
  "org.scalablytyped" %%% "libp2p__interface-keychain" % "1.0.4-863221",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-ba3d3a",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-5f08ec",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "3.0.0-08c91c",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-9299fd",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-ebf5dc",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-446616",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20211202Z-8a369d",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-24328f",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20220923Z-b9c9f1",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-7bac0d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
