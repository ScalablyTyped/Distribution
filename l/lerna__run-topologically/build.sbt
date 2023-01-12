organization := "org.scalablytyped"
name := "lerna__run-topologically"
version := "5.1-dt-20220608Z-b0f80e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "lerna__package" % "5.1-dt-20220608Z-96a8cd",
  "org.scalablytyped" %%% "lerna__package-graph" % "5.1-dt-20220608Z-8a204e",
  "org.scalablytyped" %%% "lerna__query-graph" % "5.1-dt-20220608Z-490b44",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-edb2bc",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
