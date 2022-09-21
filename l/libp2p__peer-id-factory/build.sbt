organization := "org.scalablytyped"
name := "libp2p__peer-id-factory"
version := "1.0.18-c90cca"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "libp2p__interface-keys" % "1.0.3-2245fa",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.4-67a580",
  "org.scalablytyped" %%% "protons-runtime" % "3.1.0-454eac",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.2-03f09d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
