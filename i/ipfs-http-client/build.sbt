organization := "org.scalablytyped"
name := "ipfs-http-client"
version := "48.1.1-2fa8e0"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.1-df05c6",
  "org.scalablytyped" %%% "cids" % "1.0.2-329d22",
  "org.scalablytyped" %%% "form-data" % "3.0.0-1b5b63",
  "org.scalablytyped" %%% "libp2p-crypto" % "0.18.0-67fb19",
  "org.scalablytyped" %%% "multiaddr" % "8.1.1-d9a748",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "peer-id" % "0.14.2-7c9d35",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
