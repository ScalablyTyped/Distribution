organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20220818Z-f39622"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "logform" % "2.4.2-518243",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20221103Z-f69d73",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-04e4a3",
  "org.scalablytyped" %%% "winston" % "3.8.2-e286d5",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-7f49ca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
