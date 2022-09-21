organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20220818Z-7bffc5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "logform" % "2.4.2-c14d43",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20220818Z-f585bc",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20220819Z-8e3b69",
  "org.scalablytyped" %%% "winston" % "3.8.2-94a2eb",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-8f7803")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
