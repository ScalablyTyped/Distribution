organization := "org.scalablytyped"
name := "ipfs-http-client"
version := "48.1.1-d90d6d"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.1-719e40",
  "org.scalablytyped" %%% "cids" % "1.0.2-18ae97",
  "org.scalablytyped" %%% "form-data" % "3.0.0-109ff3",
  "org.scalablytyped" %%% "libp2p-crypto" % "0.18.0-aa3799",
  "org.scalablytyped" %%% "multiaddr" % "8.1.1-ecab8f",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "peer-id" % "0.14.2-930332",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
