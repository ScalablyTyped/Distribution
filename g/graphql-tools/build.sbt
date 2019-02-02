organization := "org.scalablytyped"
name := "graphql-tools"
version := "4.0.4-92f0da"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-cc52df",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-66344e",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-da91f3",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ddf996",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190107Z-5c65a8",
  "org.scalablytyped" %%% "iterall" % "1.2.2-4373bf",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-dbdaa1",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-0cbed1",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-29c689")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        