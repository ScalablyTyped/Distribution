organization := "org.scalablytyped"
name := "libp2p__peer-id-factory"
version := "1.0.18-6d824d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "libp2p__interface-keys" % "1.0.3-d46e3b",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-22cec9",
  "org.scalablytyped" %%% "multiformats" % "10.0.0-cc5814",
  "org.scalablytyped" %%% "protons-runtime" % "3.1.0-30684e",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.2-03d59f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
