organization := "org.scalablytyped"
name := "it-tar"
version := "6.0.1-aae691"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "it-stream-types" % "2.0.1-7b1af1",
  "org.scalablytyped" %%% "multiformats" % "11.0.2-431de3",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "uint8arraylist" % "2.4.3-0097de",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.3-acd878")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
