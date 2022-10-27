organization := "org.scalablytyped"
name := "libp2p__mdns"
version := "5.0.0-e833b8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-011631",
  "org.scalablytyped" %%% "dns-packet" % "5.2-dt-20211208Z-fc0a2f",
  "org.scalablytyped" %%% "libp2p__interface-address-manager" % "2.0.0-9fded2",
  "org.scalablytyped" %%% "libp2p__interface-peer-discovery" % "1.0.1-8a335f",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-22c095",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-66399b",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-5a062f",
  "org.scalablytyped" %%% "multicast-dns" % "7.2-dt-20220624Z-094562",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-cc7cca",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-d92aed",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
