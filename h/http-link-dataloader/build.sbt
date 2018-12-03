organization := "com.scalablytyped"
name := "http-link-dataloader"
version := "0.1.6-66994b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-link" % "1.2.4-cf91b1",
  "com.scalablytyped" %%% "apollo-utilities" % "1.0.26-9dddf4",
  "com.scalablytyped" %%% "cross-fetch" % "2.2.3-d117a6",
  "com.scalablytyped" %%% "dataloader" % "1.4.0-d0d4f3",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-dd545c",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-0916c6",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-854602",
  "com.scalablytyped" %%% "zen-observable-ts" % "0.8.11-bacf6e",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        