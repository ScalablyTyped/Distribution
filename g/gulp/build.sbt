organization := "org.scalablytyped"
name := "gulp"
version := "4.0-dt-20201002Z-853a1c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chokidar" % "3.4.3-bedcd8",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-de8bc7",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20201002Z-2bee10",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-e93439",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20200902Z-b2121a",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20200515Z-99c437",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-34a471",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20200515Z-ef26ef")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
