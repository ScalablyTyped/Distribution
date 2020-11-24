organization := "org.scalablytyped"
name := "libp2p-gossipsub"
version := "0.6.6-d62495"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cids" % "1.0.2-d0d9d3",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-423206",
  "org.scalablytyped" %%% "it-pushable" % "1.4.0-2d3b3a",
  "org.scalablytyped" %%% "libp2p-crypto" % "0.18.0-bbe5c3",
  "org.scalablytyped" %%% "libp2p-interfaces" % "0.7.2-653b2e",
  "org.scalablytyped" %%% "multiaddr" % "8.1.1-52bd3a",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "peer-id" % "0.14.2-4fdaf4",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
