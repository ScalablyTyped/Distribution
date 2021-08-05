organization := "org.scalablytyped"
name := "gulp-help-doc"
version := "0.0-unknown-dt-20201002Z-d491aa"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chokidar" % "3.4.3-0c1ecb",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-623eaa",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20201002Z-489304",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20201002Z-4129af",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-c7d5c6",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20200902Z-d3d814",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20200515Z-99c437",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-85853c",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20200515Z-e8f51b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
