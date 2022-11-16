organization := "org.scalablytyped"
name := "ipfs-unixfs-importer"
version := "11.0.1-5b6fe3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hamt-sharding" % "3.0.2-52cc39",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.1-7405e5",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-c00699",
  "org.scalablytyped" %%% "ipfs-unixfs" % "8.0.0-8d9552",
  "org.scalablytyped" %%% "ipld__dag-pb" % "3.0.0-e51193",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-04b3d3",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
