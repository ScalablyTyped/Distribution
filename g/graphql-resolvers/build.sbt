organization := "org.scalablytyped"
name := "graphql-resolvers"
version := "0.2-dt-20181027Z-2ebc61"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-d81515",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-6eebd1",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-049e25",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-505dae",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.3-eeaab2",
  "org.scalablytyped" %%% "iterall" % "1.2.2-8bc400",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-ba3729",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-671f25",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-74d34a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        