organization := "org.scalablytyped"
name := "ionic__cli-framework-prompts"
version := "1.0.4-c94a3b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-0d2080",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-fc5d55",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-b1ecae",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-ad47f2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
