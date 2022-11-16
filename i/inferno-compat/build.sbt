organization := "org.scalablytyped"
name := "inferno-compat"
version := "8.0.4-9461ee"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "inferno" % "8.0.4-1bc9b8",
  "org.scalablytyped" %%% "inferno-create-class" % "8.0.4-5f4c6b",
  "org.scalablytyped" %%% "inferno-vnode-flags" % "8.0.4-2eff56",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
