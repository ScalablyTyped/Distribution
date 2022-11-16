organization := "org.scalablytyped"
name := "libp2p__utils"
version := "3.0.2-b8f3ee"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-1d5233",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-d3f578",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-4f1a18",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-7d8c71",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-0bad38",
  "org.scalablytyped" %%% "libp2p__interface-peer-store" % "1.2.2-13e8cc",
  "org.scalablytyped" %%% "libp2p__interface-record" % "2.0.1-0d2489",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-03f126",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-04b3d3",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-6e66b6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-d35278")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
