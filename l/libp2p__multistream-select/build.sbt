organization := "org.scalablytyped"
name := "libp2p__multistream-select"
version := "3.0.0-fd3f38"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-3a5b28",
  "org.scalablytyped" %%% "it-reader" % "6.0.1-f88ddd",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-255b07",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-e21e00",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.2-2587d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
