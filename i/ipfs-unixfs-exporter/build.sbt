organization := "org.scalablytyped"
name := "ipfs-unixfs-exporter"
version := "8.0.6-18db25"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hamt-sharding" % "3.0.1-9de050",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.0-427189",
  "org.scalablytyped" %%% "interface-store" % "3.0.0-501164",
  "org.scalablytyped" %%% "ipfs-unixfs" % "7.0.0-cd20bf",
  "org.scalablytyped" %%% "ipld__dag-pb" % "2.1.18-183cf2",
  "org.scalablytyped" %%% "multiformats" % "9.9.0-ff23d3",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
