organization := "org.scalablytyped"
name := "libp2p-noise"
version := "2.0.1-d6ac34"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20200923Z-39fbf4",
  "org.scalablytyped" %%% "buffer" % "6.0.3-03aceb",
  "org.scalablytyped" %%% "cids" % "1.0.2-18ae97",
  "org.scalablytyped" %%% "it-pb-rpc" % "0.1.9-ea4d1e",
  "org.scalablytyped" %%% "libp2p-crypto" % "0.18.0-aa3799",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "peer-id" % "0.14.2-930332",
  "org.scalablytyped" %%% "protobufjs" % "6.10.2-f9a9f4",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
