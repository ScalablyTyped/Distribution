organization := "org.scalablytyped"
name := "libp2p__peer-store"
version := "5.0.0-d96132"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-011631",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-ee1118",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-28bc3a",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-22c095",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-66399b",
  "org.scalablytyped" %%% "libp2p__interface-peer-store" % "1.2.2-adc942",
  "org.scalablytyped" %%% "libp2p__interface-record" % "2.0.1-9c1936",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-5a062f",
  "org.scalablytyped" %%% "libp2p__peer-record" % "4.0.4-74d797",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-cc7cca",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-d92aed",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "protons-runtime" % "4.0.1-0cf32a",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-bed8fc",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-91995b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
