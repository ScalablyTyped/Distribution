organization := "org.scalablytyped"
name := "hexo-fs"
version := "0.2-dt-20211202Z-29d0bf"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-63e35b",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-5a7a5b",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-8cc66c",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-0193a6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
