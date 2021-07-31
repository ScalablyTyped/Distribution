organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20201002Z-8c45bd"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "logform" % "2.2.0-99d644",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20201002Z-3397ab",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-983fbb",
  "org.scalablytyped" %%% "winston" % "3.3.3-aa0f1b",
  "org.scalablytyped" %%% "winston-transport" % "4.4.0-6c3393")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
