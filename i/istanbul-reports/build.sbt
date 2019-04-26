organization := "org.scalablytyped"
name := "istanbul-reports"
version := "1.1-dt-20190417Z-9d857b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-e069e9",
  "org.scalablytyped" %%% "istanbul-lib-report" % "1.1-dt-20190425Z-7246f5",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        