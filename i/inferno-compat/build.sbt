organization := "org.scalablytyped"
name := "inferno-compat"
version := "8.0.4-13d74d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "inferno" % "8.0.4-f64c55",
  "org.scalablytyped" %%% "inferno-create-class" % "8.0.4-149a3e",
  "org.scalablytyped" %%% "inferno-vnode-flags" % "8.0.4-1c62fc",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
