organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20220910Z-ed8ac4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-c67867",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-65a364",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-92678d",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20220911Z-11fc96",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-beb943",
  "org.scalablytyped" %%% "moment" % "2.29.4-b4e779",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20220722Z-b73d40")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
