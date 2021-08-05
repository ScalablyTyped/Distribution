organization := "org.scalablytyped"
name := "karma-browserify"
version := "7.0-dt-20200226Z-cc39a9"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "browserify" % "12.0-dt-20200923Z-8c8de9",
  "org.scalablytyped" %%% "insert-module-globals" % "7.0-dt-20200515Z-f4d8e7",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "watchify" % "3.11-dt-20200302Z-f00f73")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
