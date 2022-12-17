organization := "org.scalablytyped"
name := "gulp-cache"
version := "v0.4.5-dt-20220818Z-c28ac6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "5.1.2-44f540",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20221107Z-d730a3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20221114Z-c1eb5d",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-04e4a3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
