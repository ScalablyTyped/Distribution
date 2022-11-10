organization := "org.scalablytyped"
name := "ipfs-unixfs-importer"
version := "11.0.1-3ec630"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hamt-sharding" % "3.0.2-108ea7",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.1-1e417e",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-ade001",
  "org.scalablytyped" %%% "ipfs-unixfs" % "8.0.0-663d98",
  "org.scalablytyped" %%% "ipld__dag-pb" % "3.0.0-b536ce",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-ebf5dc",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
