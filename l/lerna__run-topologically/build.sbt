organization := "org.scalablytyped"
name := "lerna__run-topologically"
version := "5.1-dt-20220608Z-54af5a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "lerna__package" % "5.1-dt-20220608Z-2df754",
  "org.scalablytyped" %%% "lerna__package-graph" % "5.1-dt-20220608Z-910ae6",
  "org.scalablytyped" %%% "lerna__query-graph" % "5.1-dt-20220608Z-1328c6",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-edb2bc",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
