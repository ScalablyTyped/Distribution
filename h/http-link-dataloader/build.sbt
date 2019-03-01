organization := "org.scalablytyped"
name := "http-link-dataloader"
version := "0.1.6-6575c5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-778406",
  "org.scalablytyped" %%% "cross-fetch" % "3.0.1-5b4ce3",
  "org.scalablytyped" %%% "dataloader" % "1.4.0-cbe5ca",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-f9010a",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-1e1851",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-5c7895",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-197aae")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        