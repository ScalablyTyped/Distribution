organization := "org.scalablytyped"
name := "libp2p__peer-store"
version := "8.1.2-7a4c23"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.1-33129a",
  "org.scalablytyped" %%% "interface-datastore" % "8.2.0-70429c",
  "org.scalablytyped" %%% "interface-store" % "5.1.0-a4fb4a",
  "org.scalablytyped" %%% "it-stream-types" % "2.0.1-0d2408",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "5.0.2-81453d",
  "org.scalablytyped" %%% "libp2p__interface-content-routing" % "2.1.1-2879a8",
  "org.scalablytyped" %%% "libp2p__interface-keychain" % "2.0.5-18c1aa",
  "org.scalablytyped" %%% "libp2p__interface-libp2p" % "3.1.0-4e3ad8",
  "org.scalablytyped" %%% "libp2p__interface-metrics" % "4.0.8-03c708",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "2.0.2-3b3a0e",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.10-d0181f",
  "org.scalablytyped" %%% "libp2p__interface-peer-routing" % "1.1.1-789ec6",
  "org.scalablytyped" %%% "libp2p__interface-peer-store" % "2.0.3-e4c448",
  "org.scalablytyped" %%% "libp2p__interface-registrar" % "2.0.12-e3239b",
  "org.scalablytyped" %%% "libp2p__interface-stream-muxer" % "4.0.1-dc3e1f",
  "org.scalablytyped" %%% "libp2p__interface-transport" % "4.0.2-d193f8",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.3.2-e477a0",
  "org.scalablytyped" %%% "mortice" % "3.0.1-e04e2e",
  "org.scalablytyped" %%% "multiformats" % "11.0.2-8d8a57",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "12.1.2-a0f1b9",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "protons-runtime" % "5.0.0-2c8611",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "uint8arraylist" % "2.4.3-95c018",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.3-07439c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
