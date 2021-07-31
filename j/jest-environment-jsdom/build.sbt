organization := "org.scalablytyped"
name := "jest-environment-jsdom"
version := "26.6.2-af5478"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-7566cb",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-a1e107",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20200720Z-89a2ef",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-ad4d82",
  "org.scalablytyped" %%% "jest__environment" % "26.6.2-538248",
  "org.scalablytyped" %%% "jest__types" % "26.6.2-2cedcf",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
