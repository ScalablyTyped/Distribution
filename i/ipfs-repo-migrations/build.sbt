organization := "org.scalablytyped"
name := "ipfs-repo-migrations"
version := "14.0.1-4f6815"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "interface-blockstore" % "3.0.1-874f3f",
  "org.scalablytyped" %%% "interface-datastore" % "7.0.1-a82cfe",
  "org.scalablytyped" %%% "interface-store" % "3.0.1-a39b9b",
  "org.scalablytyped" %%% "ipld__dag-pb" % "3.0.0-38ca72",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-dbe0b0",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.2-7a2910")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
