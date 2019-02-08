organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-b2a773"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-7b23ed",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180214Z-a03fb6",
  "org.scalablytyped" %%% "inversify" % "5.0.1-4f9552",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-3f459a",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-cc33f7",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        