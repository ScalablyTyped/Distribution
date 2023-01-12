organization := "org.scalablytyped"
name := "libp2p__webrtc-star-protocol"
version := "2.0.1-341dd8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "engine_dot_io-client" % "6.2.3-0cad08",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-2f7cdd",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "socket_dot_io-client" % "4.5.3-a661b9",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-652824",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-859bca",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
