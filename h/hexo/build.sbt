organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20220910Z-83a392"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-463b2d",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-c20552",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-897197",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20220911Z-e3e4a0",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-bd7a55",
  "org.scalablytyped" %%% "moment" % "2.29.4-a513be",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20220722Z-d77df1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
