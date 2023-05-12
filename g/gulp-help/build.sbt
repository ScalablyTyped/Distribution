organization := "org.scalablytyped"
name := "gulp-help"
version := "1.6-dt-20230510Z-595503"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "anymatch" % "3.1.3-0a75c9",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-83a7b5",
  "org.scalablytyped" %%% "glob-stream" % "v8.0.0-dt-20230510Z-e385ef",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20230510Z-a383f3",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "orchestrator" % "0.3-dt-20221230Z-e47e7c",
  "org.scalablytyped" %%% "picomatch" % "2.3-dt-20211202Z-284a14",
  "org.scalablytyped" %%% "q" % "1.5-dt-20221230Z-f67b26",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "streamx" % "2.9-dt-20220624Z-400e4c",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20221230Z-f0e4c9",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20221230Z-1d8ebd",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-fbd7c2",
  "org.scalablytyped" %%% "vinyl-fs" % "3.0-dt-20230510Z-4dcdce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
