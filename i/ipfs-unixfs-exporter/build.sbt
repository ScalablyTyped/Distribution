organization := "org.scalablytyped"
name := "ipfs-unixfs-exporter"
version := "8.0.5-a54a3b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hamt-sharding" % "3.0.1-4b30d7",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.0-964e21",
  "org.scalablytyped" %%% "interface-store" % "3.0.0-47e5bc",
  "org.scalablytyped" %%% "ipfs-unixfs" % "7.0.0-a7c1ef",
  "org.scalablytyped" %%% "ipld__dag-pb" % "2.1.18-f9ef9e",
  "org.scalablytyped" %%% "multiformats" % "9.9.0-32eac2",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
