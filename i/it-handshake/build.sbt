organization := "org.scalablytyped"
name := "it-handshake"
version := "4.1.3-6deb43"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "it-pushable" % "3.1.3-2836b1",
  "org.scalablytyped" %%% "it-reader" % "6.0.4-b33964",
  "org.scalablytyped" %%% "it-stream-types" % "2.0.1-7b1af1",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "uint8arraylist" % "2.4.3-0097de")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
