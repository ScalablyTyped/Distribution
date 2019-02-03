organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-fee312"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-25de37",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180214Z-ba6cdd",
  "org.scalablytyped" %%% "inversify" % "5.0.1-4f9552",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-752716",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-62282d",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        