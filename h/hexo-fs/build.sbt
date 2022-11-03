organization := "org.scalablytyped"
name := "hexo-fs"
version := "0.2-dt-20211202Z-1d261d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-63e35b",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20221103Z-5a7a5b",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-8d7a3d",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-395f8b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
