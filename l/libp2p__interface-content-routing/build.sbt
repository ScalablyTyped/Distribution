organization := "org.scalablytyped"
name := "libp2p__interface-content-routing"
version := "2.1.1-2879a8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.1-33129a",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "2.0.2-3b3a0e",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.10-d0181f",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.3.2-e477a0",
  "org.scalablytyped" %%% "multiformats" % "11.0.2-8d8a57",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "12.1.2-a0f1b9",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
