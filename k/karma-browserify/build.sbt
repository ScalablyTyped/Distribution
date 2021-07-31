organization := "org.scalablytyped"
name := "karma-browserify"
version := "7.0-dt-20200226Z-0b4ef8"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "browserify" % "12.0-dt-20200923Z-9ab92b",
  "org.scalablytyped" %%% "insert-module-globals" % "7.0-dt-20200515Z-279ae8",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "watchify" % "3.11-dt-20200302Z-6c85bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
