organization := "org.scalablytyped"
name := "libp2p-interfaces"
version := "0.7.2-228afc"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cids" % "1.0.2-18ae97",
  "org.scalablytyped" %%% "it-pushable" % "1.4.0-83a230",
  "org.scalablytyped" %%% "libp2p-crypto" % "0.18.0-aa3799",
  "org.scalablytyped" %%% "multiaddr" % "8.1.1-ecab8f",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "peer-id" % "0.14.2-930332",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
