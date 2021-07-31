organization := "org.scalablytyped"
name := "libp2p-noise"
version := "2.0.1-1c37ee"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20200923Z-72dba9",
  "org.scalablytyped" %%% "buffer" % "6.0.3-54b5df",
  "org.scalablytyped" %%% "cids" % "1.0.2-329d22",
  "org.scalablytyped" %%% "it-pb-rpc" % "0.1.9-1ac65f",
  "org.scalablytyped" %%% "libp2p-crypto" % "0.18.0-67fb19",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "peer-id" % "0.14.2-7c9d35",
  "org.scalablytyped" %%% "protobufjs" % "6.10.2-cbfb36",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
