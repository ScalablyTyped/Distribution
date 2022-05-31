organization := "org.scalablytyped"
name := "libp2p-interfaces"
version := "0.7.2-25f4a6"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cids" % "1.0.2-d5a21b",
  "org.scalablytyped" %%% "it-pushable" % "1.4.0-6b3828",
  "org.scalablytyped" %%% "libp2p-crypto" % "0.18.0-09cd04",
  "org.scalablytyped" %%% "multiaddr" % "8.1.1-d859e3",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "peer-id" % "0.14.2-34dfcf",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
