organization := "org.scalablytyped"
name := "ipfs-core-utils"
version := "0.16.1-02aa93"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-7e747b",
  "org.scalablytyped" %%% "hamt-sharding" % "3.0.1-d7da76",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.0-74fa13",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-7ca61f",
  "org.scalablytyped" %%% "ipfs-unixfs" % "7.0.0-b7daf9",
  "org.scalablytyped" %%% "ipfs-unixfs-importer" % "10.0.2-1c77af",
  "org.scalablytyped" %%% "ipld__dag-pb" % "2.1.18-5f884b",
  "org.scalablytyped" %%% "multiformats" % "10.0.0-e339c8",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.1-9c49c7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
