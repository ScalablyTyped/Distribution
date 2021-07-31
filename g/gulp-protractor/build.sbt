organization := "org.scalablytyped"
name := "gulp-protractor"
version := "v1.0.0-dt-20201002Z-7bcb48"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chokidar" % "3.4.3-78717a",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-f6476c",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20201002Z-fee566",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20201002Z-7dbe62",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-916fd1",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20200902Z-714ec0",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20200515Z-a17ba2",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-983fbb",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20200515Z-ab9cef")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
