organization := "org.scalablytyped"
name := "gulp-cache"
version := "v0.4.5-dt-20220818Z-eeafbd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "5.1.2-e08eec",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20221107Z-c84f13",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20221107Z-fdaab0",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-e54af9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
