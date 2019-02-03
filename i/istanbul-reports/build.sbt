organization := "org.scalablytyped"
name := "istanbul-reports"
version := "1.1-dt-20180214Z-73de97"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "1.1-dt-20180214Z-d525eb",
  "org.scalablytyped" %%% "istanbul-lib-report" % "1.1-dt-20180214Z-9b98bc",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        