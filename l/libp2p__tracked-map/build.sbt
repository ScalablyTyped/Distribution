organization := "org.scalablytyped"
name := "libp2p__tracked-map"
version := "2.0.2-96b43b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-6c7d9c",
  "org.scalablytyped" %%% "libp2p__interface-metrics" % "3.0.0-885ec2",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.4-67a580",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
