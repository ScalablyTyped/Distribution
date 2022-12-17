organization := "org.scalablytyped"
name := "ipfs-core-utils"
version := "0.17.0-6a687d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-536636",
  "org.scalablytyped" %%% "hamt-sharding" % "3.0.2-d5bd07",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.1-dda01e",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-0a0540",
  "org.scalablytyped" %%% "ipfs-unixfs" % "8.0.0-480845",
  "org.scalablytyped" %%% "ipfs-unixfs-importer" % "11.0.1-465ebf",
  "org.scalablytyped" %%% "ipld__dag-pb" % "3.0.0-ef5b6d",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-27d400",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-1e49a2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
