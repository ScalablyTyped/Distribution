organization := "org.scalablytyped"
name := "istanbul-lib-instrument"
version := "1.7-dt-20200515Z-473d44"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20200902Z-1b748f",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-7566cb",
  "org.scalablytyped" %%% "source-map" % "0.7.3-755fd4",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
