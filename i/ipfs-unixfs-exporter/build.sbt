organization := "org.scalablytyped"
name := "ipfs-unixfs-exporter"
version := "8.0.6-a1ef40"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hamt-sharding" % "3.0.1-d7da76",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.0-74fa13",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-7ca61f",
  "org.scalablytyped" %%% "ipfs-unixfs" % "7.0.0-b7daf9",
  "org.scalablytyped" %%% "ipld__dag-pb" % "2.1.18-5f884b",
  "org.scalablytyped" %%% "multiformats" % "10.0.0-e339c8",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
