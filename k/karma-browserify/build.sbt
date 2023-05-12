organization := "org.scalablytyped"
name := "karma-browserify"
version := "7.0-dt-20211202Z-1da282"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "browserify" % "12.0-dt-20221230Z-cd2591",
  "org.scalablytyped" %%% "insert-module-globals" % "7.0-dt-20211202Z-83be4e",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "watchify" % "3.11-dt-20211202Z-2751b4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
