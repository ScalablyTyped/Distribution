organization := "org.scalablytyped"
name := "jest__types"
version := "26.6.2-82a7d8"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-026589",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-881d94",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20200720Z-b2c271",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
