organization := "org.scalablytyped"
name := "ipfs-cli"
version := "0.2.1-5141ed"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bignumber_dot_js" % "9.0.1-df05c6",
  "org.scalablytyped" %%% "cids" % "1.0.2-329d22",
  "org.scalablytyped" %%% "libp2p-crypto" % "0.18.0-67fb19",
  "org.scalablytyped" %%% "multiaddr" % "8.1.1-d9a748",
  "org.scalablytyped" %%% "parse-duration" % "0.4.4-9cff86",
  "org.scalablytyped" %%% "peer-id" % "0.14.2-7c9d35",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
