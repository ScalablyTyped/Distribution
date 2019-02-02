organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-fa3591"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-6aae7a",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180214Z-d020a9",
  "org.scalablytyped" %%% "inversify" % "5.0.1-6b5da1",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-d376e8",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-8d4646",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        