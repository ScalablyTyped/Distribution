organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20220910Z-58a0ca"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20221103Z-0f6871",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-730932",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-fdb527",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20220911Z-d4b678",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-1b07bd",
  "org.scalablytyped" %%% "moment" % "2.29.4-336174",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20220722Z-a428d7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
