organization := "org.scalablytyped"
name := "karma-browserify"
version := "7.0-dt-20211202Z-35c196"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "browserify" % "12.0-dt-20211202Z-ccfb54",
  "org.scalablytyped" %%% "insert-module-globals" % "7.0-dt-20211202Z-c3f8d6",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "watchify" % "3.11-dt-20211202Z-0f1b03")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
