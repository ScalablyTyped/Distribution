organization := "org.scalablytyped"
name := "libp2p-gossipsub"
version := "0.6.6-51b5bf"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "cids" % "1.0.2-4e7882",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-c5583a",
  "org.scalablytyped" %%% "it-pushable" % "1.4.0-c9e1a9",
  "org.scalablytyped" %%% "libp2p-crypto" % "0.18.0-b0228e",
  "org.scalablytyped" %%% "libp2p-interfaces" % "0.7.2-9fadea",
  "org.scalablytyped" %%% "multiaddr" % "8.1.1-5a845d",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "peer-id" % "0.14.2-e650f2",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
