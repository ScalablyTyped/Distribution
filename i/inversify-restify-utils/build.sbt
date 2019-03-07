organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-2ef0ae"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-3dee0e",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180214Z-e34880",
  "org.scalablytyped" %%% "inversify" % "5.0.1-800aa1",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190212Z-a845c2",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-2c570b",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        