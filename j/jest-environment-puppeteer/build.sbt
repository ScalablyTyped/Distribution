organization := "org.scalablytyped"
name := "jest-environment-puppeteer"
version := "4.4-dt-20200928Z-c0faf6"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-026589",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-881d94",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20200720Z-b2c271",
  "org.scalablytyped" %%% "jest-environment-node" % "26.6.2-501051",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-bb725e",
  "org.scalablytyped" %%% "jest__environment" % "26.6.2-742778",
  "org.scalablytyped" %%% "jest__types" % "26.6.2-82a7d8",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "puppeteer" % "5.4-dt-20201103Z-bb0bb6",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
