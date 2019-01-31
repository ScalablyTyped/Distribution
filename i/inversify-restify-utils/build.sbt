organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-ce8dd6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-0b2b5e",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180214Z-15911f",
  "org.scalablytyped" %%% "inversify" % "5.0.1-6b5da1",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-47bf94",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-254fda",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        