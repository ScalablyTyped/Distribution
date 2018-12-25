organization := "org.scalablytyped"
name := "joigoose"
version := "2.0-dt-20180214Z-63a59e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-d496ac",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-2ffee8",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181223Z-7d3e22",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20181210Z-945f29",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        