organization := "org.scalablytyped"
name := "hexo-fs"
version := "0.2-dt-20211202Z-8693ec"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-63e35b",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-5a7a5b",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-548487",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-a443ec",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
