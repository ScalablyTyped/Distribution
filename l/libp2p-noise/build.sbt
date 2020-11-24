organization := "org.scalablytyped"
name := "libp2p-noise"
version := "2.0.1-b57fae"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20200923Z-d0cafd",
  "org.scalablytyped" %%% "buffer" % "6.0.3-8cb332",
  "org.scalablytyped" %%% "cids" % "1.0.2-d0d9d3",
  "org.scalablytyped" %%% "it-pb-rpc" % "0.1.9-c52921",
  "org.scalablytyped" %%% "libp2p-crypto" % "0.18.0-bbe5c3",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "peer-id" % "0.14.2-4fdaf4",
  "org.scalablytyped" %%% "protobufjs" % "6.10.2-e4d697",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
