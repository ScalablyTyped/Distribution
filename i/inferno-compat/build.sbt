organization := "org.scalablytyped"
name := "inferno-compat"
version := "8.0.4-880ea4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "inferno" % "8.0.4-cde4cc",
  "org.scalablytyped" %%% "inferno-create-class" % "8.0.4-f9e198",
  "org.scalablytyped" %%% "inferno-vnode-flags" % "8.0.4-a9f83d",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
