organization := "org.scalablytyped"
name := "istanbul-reports"
version := "1.1-dt-20180214Z-fc5f7a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190311Z-60d1a2",
  "org.scalablytyped" %%% "istanbul-lib-report" % "1.1-dt-20180214Z-9b3c90",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        