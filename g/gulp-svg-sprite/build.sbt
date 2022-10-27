organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20220818Z-f5acc8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "logform" % "2.4.2-2366c7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20220818Z-8415d5",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20220819Z-95b2b5",
  "org.scalablytyped" %%% "winston" % "3.8.2-6dd120",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-c70b50")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
