organization := "org.scalablytyped"
name := "lerna__run-topologically"
version := "5.1-dt-20220608Z-8bf1c3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "lerna__package" % "5.1-dt-20220608Z-3308d3",
  "org.scalablytyped" %%% "lerna__package-graph" % "5.1-dt-20220608Z-a50c14",
  "org.scalablytyped" %%% "lerna__query-graph" % "5.1-dt-20220608Z-c753bc",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-92634e",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
