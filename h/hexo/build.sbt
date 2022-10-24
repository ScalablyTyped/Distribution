organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20220910Z-cc11bf"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-5a7a5b",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-7a320b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-4c8ee8",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20220911Z-f357dc",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-fb5c8a",
  "org.scalablytyped" %%% "moment" % "2.29.4-dbaff2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20220722Z-4f6e95")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
