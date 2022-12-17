organization := "org.scalablytyped"
name := "libp2p__topology"
version := "3.0.1-6493c4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-536636",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-afe6ba",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-aa5d91",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-981e22",
  "org.scalablytyped" %%% "libp2p__interface-registrar" % "2.0.3-5c41ea",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-1eba2b",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-27d400",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-1e49a2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-29eebc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
