organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20220910Z-d5504e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20221103Z-c012d5",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-c4ac72",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-36a2d0",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20220911Z-726756",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-b29a54",
  "org.scalablytyped" %%% "moment" % "2.29.4-bc3b08",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20220722Z-2510dd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
