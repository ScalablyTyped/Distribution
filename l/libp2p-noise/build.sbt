organization := "org.scalablytyped"
name := "libp2p-noise"
version := "2.0.1-ed4314"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20200923Z-a17b85",
  "org.scalablytyped" %%% "buffer" % "6.0.3-20ade9",
  "org.scalablytyped" %%% "cids" % "1.0.2-4e7882",
  "org.scalablytyped" %%% "it-pb-rpc" % "0.1.9-2d88e3",
  "org.scalablytyped" %%% "libp2p-crypto" % "0.18.0-b0228e",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "peer-id" % "0.14.2-e650f2",
  "org.scalablytyped" %%% "protobufjs" % "6.10.2-e0a6c7",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
