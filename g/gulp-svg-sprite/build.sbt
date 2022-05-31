organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20201002Z-38b693"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "logform" % "2.2.0-d217c6",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20201002Z-7ccb35",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-34a471",
  "org.scalablytyped" %%% "winston" % "3.3.3-ff1456",
  "org.scalablytyped" %%% "winston-transport" % "4.4.0-10a7b6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
