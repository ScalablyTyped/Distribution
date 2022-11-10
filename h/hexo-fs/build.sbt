organization := "org.scalablytyped"
name := "hexo-fs"
version := "0.2-dt-20211202Z-ba9d8d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-b8a828",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20221103Z-6d7ec9",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-219e25",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-2fc8e2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
