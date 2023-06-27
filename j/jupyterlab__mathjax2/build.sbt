organization := "org.scalablytyped"
name := "jupyterlab__mathjax2"
version := "3.6.3-3c3004"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "3.8.2-d7fec2",
  "org.scalablytyped" %%% "lumino__commands" % "2.1.1-6f0233",
  "org.scalablytyped" %%% "lumino__coreutils" % "2.1.1-fa32d0",
  "org.scalablytyped" %%% "lumino__disposable" % "2.1.1-5fe0f9",
  "org.scalablytyped" %%% "lumino__messaging" % "2.0.0-4f103c",
  "org.scalablytyped" %%% "lumino__signaling" % "2.1.1-eaba81",
  "org.scalablytyped" %%% "lumino__virtualdom" % "2.0.0-7ca7d8",
  "org.scalablytyped" %%% "lumino__widgets" % "2.1.1-57baf1",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
