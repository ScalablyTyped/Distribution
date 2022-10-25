organization := "org.scalablytyped"
name := "libp2p__components"
version := "2.1.0-3cdc63"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-011631",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-ee1118",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-28bc3a",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-52a3a3",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-43f797",
  "org.scalablytyped" %%% "libp2p__interface-address-manager" % "2.0.0-b90ee9",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-ac11e4",
  "org.scalablytyped" %%% "libp2p__interface-connection-manager" % "1.3.0-c48291",
  "org.scalablytyped" %%% "libp2p__interface-content-routing" % "1.0.3-0796f2",
  "org.scalablytyped" %%% "libp2p__interface-dht" % "1.0.2-41f823",
  "org.scalablytyped" %%% "libp2p__interface-metrics" % "3.0.0-6e4cf0",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-a1d93b",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-22c095",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-0371c7",
  "org.scalablytyped" %%% "libp2p__interface-peer-routing" % "1.0.1-8b8f64",
  "org.scalablytyped" %%% "libp2p__interface-peer-store" % "1.2.2-97eda4",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "3.0.0-791acb",
  "org.scalablytyped" %%% "libp2p__interface-record" % "2.0.1-9c1936",
  "org.scalablytyped" %%% "libp2p__interface-registrar" % "2.0.3-067f12",
  "org.scalablytyped" %%% "libp2p__interface-stream-muxer" % "3.0.0-bd53e1",
  "org.scalablytyped" %%% "libp2p__interface-transport" % "2.0.0-8ef4af",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-5a062f",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-cc7cca",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-b2fe9b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-bed8fc",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-91995b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
