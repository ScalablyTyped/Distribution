organization := "org.scalablytyped"
name := "http-link-dataloader"
version := "0.1.6-6a88a3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-f5ddbe",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-181e22",
  "org.scalablytyped" %%% "cross-fetch" % "2.2.3-26c006",
  "org.scalablytyped" %%% "dataloader" % "1.4.0-9a3e21",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-f94ee7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-dbcdca",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-cf13fe",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-203351")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        