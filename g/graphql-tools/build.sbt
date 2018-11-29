organization := "com.scalablytyped"
name := "graphql-tools"
version := "4.0.3-13b271"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-link" % "1.2.4-cf91b1",
  "com.scalablytyped" %%% "apollo-utilities" % "1.0.26-9dddf4",
  "com.scalablytyped" %%% "deprecated-decorator" % "0.1.6-d4fb36",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-dd545c",
  "com.scalablytyped" %%% "iterall" % "1.2.2-e9ddad",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-636507",
  "com.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-854602",
  "com.scalablytyped" %%% "zen-observable-ts" % "0.8.11-bacf6e",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        