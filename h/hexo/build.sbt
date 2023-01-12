organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20220910Z-e8d36e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20221103Z-1882ae",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-fff3da",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-4bfaa3",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20220911Z-670cc4",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-e56dbe",
  "org.scalablytyped" %%% "moment" % "2.29.4-c1da03",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20220722Z-19c570")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
