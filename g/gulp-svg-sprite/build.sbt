organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20220818Z-34a25c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "logform" % "2.4.2-2366c7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20220818Z-79795f",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20220819Z-25f09a",
  "org.scalablytyped" %%% "winston" % "3.8.2-34f3c6",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-0994d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
