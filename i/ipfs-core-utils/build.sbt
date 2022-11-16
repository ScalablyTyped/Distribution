organization := "org.scalablytyped"
name := "ipfs-core-utils"
version := "0.17.0-270620"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-1d5233",
  "org.scalablytyped" %%% "hamt-sharding" % "3.0.2-52cc39",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.1-7405e5",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-c00699",
  "org.scalablytyped" %%% "ipfs-unixfs" % "8.0.0-8d9552",
  "org.scalablytyped" %%% "ipfs-unixfs-importer" % "11.0.1-5b6fe3",
  "org.scalablytyped" %%% "ipld__dag-pb" % "3.0.0-e51193",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-04b3d3",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-6e66b6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
