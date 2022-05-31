organization := "org.scalablytyped"
name := "libp2p-noise"
version := "2.0.1-c57c78"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20200923Z-f73fcb",
  "org.scalablytyped" %%% "buffer" % "6.0.3-99410f",
  "org.scalablytyped" %%% "cids" % "1.0.2-d5a21b",
  "org.scalablytyped" %%% "it-pb-rpc" % "0.1.9-1d16fe",
  "org.scalablytyped" %%% "libp2p-crypto" % "0.18.0-09cd04",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "peer-id" % "0.14.2-34dfcf",
  "org.scalablytyped" %%% "protobufjs" % "6.10.2-f8699f",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
