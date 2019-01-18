organization := "org.scalablytyped"
name := "http-link-dataloader"
version := "0.1.6-93eaf8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-dc6387",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-c9719d",
  "org.scalablytyped" %%% "cross-fetch" % "3.0.0-933c8e",
  "org.scalablytyped" %%% "dataloader" % "1.4.0-581f9d",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-c8d4b8",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190107Z-b6e998",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-66b2ff",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-5cf802",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-e9f354")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        