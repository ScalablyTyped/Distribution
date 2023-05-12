organization := "org.scalablytyped"
name := "inferno-compat"
version := "8.0.4-3bea67"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "inferno" % "8.1.1-a75bff",
  "org.scalablytyped" %%% "inferno-create-class" % "8.0.4-4904e0",
  "org.scalablytyped" %%% "inferno-vnode-flags" % "8.1.1-6cc02e",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
