organization := "org.scalablytyped"
name := "gulp-cache"
version := "v0.4.5-dt-20201002Z-e84d62"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "4.1.0-5f22aa",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20200515Z-37d5f4",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20201002Z-583ce5",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-85853c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
