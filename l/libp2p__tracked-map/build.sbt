organization := "org.scalablytyped"
name := "libp2p__tracked-map"
version := "2.0.2-dcc88a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-d3f578",
  "org.scalablytyped" %%% "libp2p__interface-metrics" % "3.0.0-03bb66",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-7d8c71",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-04b3d3",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
