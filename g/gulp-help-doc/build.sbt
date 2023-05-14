organization := "org.scalablytyped"
name := "gulp-help-doc"
version := "0.0-unknown-dt-20230510Z-1ec039"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "anymatch" % "3.1.3-0a75c9",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-b89d67",
  "org.scalablytyped" %%% "glob-stream" % "v8.0.0-dt-20230510Z-846c6c",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20230510Z-f45503",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "picomatch" % "2.3-dt-20211202Z-284a14",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "streamx" % "2.9-dt-20220624Z-19f445",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20221230Z-0393a3",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20221230Z-1d8ebd",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-481065",
  "org.scalablytyped" %%% "vinyl-fs" % "3.0-dt-20230510Z-c2a1b9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
