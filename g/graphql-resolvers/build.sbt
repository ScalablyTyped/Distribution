organization := "org.scalablytyped"
name := "graphql-resolvers"
version := "0.2-dt-20181024Z-b85e2d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-f30531",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-add0e3",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-775407",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-82585c",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-d9f4a2",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-f8e7af",
  "org.scalablytyped" %%% "iterall" % "1.2.2-f97d72",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "ts-invariant" % "0.2.1-4a4f36",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-6db83f",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-c37980",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-abdcc5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        