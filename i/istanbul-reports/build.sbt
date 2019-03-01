organization := "org.scalablytyped"
name := "istanbul-reports"
version := "1.1-dt-20180214Z-ed62b1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "1.1-dt-20180214Z-bc1976",
  "org.scalablytyped" %%% "istanbul-lib-report" % "1.1-dt-20180214Z-d5e6e5",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        