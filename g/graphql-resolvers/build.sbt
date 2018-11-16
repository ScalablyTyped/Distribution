organization := "com.scalablytyped"
name := "graphql-resolvers"
version := "0.2-dt-20181102Z-9408f1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-link" % "1.2.3-373593",
  "com.scalablytyped" %%% "apollo-utilities" % "1.0.25-13c381",
  "com.scalablytyped" %%% "deprecated-decorator" % "0.1.6-2eb173",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181102Z-c82035",
  "com.scalablytyped" %%% "graphql-tools" % "4.0.3-d0a46d",
  "com.scalablytyped" %%% "iterall" % "1.2.2-74db06",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "uuid" % "3.4-dt-20181102Z-8308dc",
  "com.scalablytyped" %%% "zen-observable" % "0.8-dt-20181102Z-e5f69d",
  "com.scalablytyped" %%% "zen-observable-ts" % "0.8.10-c8cd90",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        