organization := "org.scalablytyped"
name := "ipfs-unixfs-importer"
version := "11.0.1-5b1b82"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hamt-sharding" % "3.0.2-046fe2",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.1-8b046d",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-28bc3a",
  "org.scalablytyped" %%% "ipfs-unixfs" % "8.0.0-ec7337",
  "org.scalablytyped" %%% "ipld__dag-pb" % "3.0.0-035d7d",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-cc7cca",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
