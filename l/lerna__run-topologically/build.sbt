organization := "org.scalablytyped"
name := "lerna__run-topologically"
version := "5.1-dt-20220608Z-bef22c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "lerna__package" % "5.1-dt-20220608Z-f488af",
  "org.scalablytyped" %%% "lerna__package-graph" % "5.1-dt-20220608Z-4cab13",
  "org.scalablytyped" %%% "lerna__query-graph" % "5.1-dt-20220608Z-c8053e",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-262b19",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
