organization := "org.scalablytyped"
name := "jupyterlab__observables"
version := "5.0.2-08badf"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "lumino__coreutils" % "2.1.1-fa32d0",
  "org.scalablytyped" %%% "lumino__disposable" % "2.1.1-5fe0f9",
  "org.scalablytyped" %%% "lumino__messaging" % "2.0.0-4f103c",
  "org.scalablytyped" %%% "lumino__signaling" % "2.1.1-eaba81",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
