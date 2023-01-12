organization := "org.scalablytyped"
name := "jupyterlab__statedb"
version := "3.5.0-8c93c0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.9.2-8eb917",
  "org.scalablytyped" %%% "lumino__commands" % "1.20.1-c0f796",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.12.1-6c186c",
  "org.scalablytyped" %%% "lumino__disposable" % "1.10.2-95b5ad",
  "org.scalablytyped" %%% "lumino__signaling" % "1.10.2-0e4ba5",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.14.2-f07ffa",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
