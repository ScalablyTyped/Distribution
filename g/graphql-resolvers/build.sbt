organization := "org.scalablytyped"
name := "graphql-resolvers"
version := "0.2-dt-20181024Z-d724cc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-74ff58",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-c55d28",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-9f49e3",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-130897",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-b55033",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-256336",
  "org.scalablytyped" %%% "iterall" % "1.2.2-39cc39",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "ts-invariant" % "0.3.2-ea625b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-f320f9",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-43c72f",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-41d5e8",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-e51018")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        