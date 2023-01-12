organization := "org.scalablytyped"
name := "ipfs-core-utils"
version := "0.17.0-a15a1a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-60582a",
  "org.scalablytyped" %%% "hamt-sharding" % "3.0.2-59d5a9",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.1-874f3f",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-a39b9b",
  "org.scalablytyped" %%% "ipfs-unixfs" % "8.0.0-59a81e",
  "org.scalablytyped" %%% "ipfs-unixfs-importer" % "11.0.1-c26739",
  "org.scalablytyped" %%% "ipld__dag-pb" % "3.0.0-38ca72",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-dbe0b0",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-cf6b57",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
