organization := "org.scalablytyped"
name := "graphql-resolvers"
version := "0.2-dt-20181024Z-075320"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.10-cd4b4e",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-da0a30",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-492e8d",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ccd0c9",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-aa9287",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-885a3f",
  "org.scalablytyped" %%% "iterall" % "1.2.2-e4101d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "ts-invariant" % "0.3.2-6c21c8",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-40951d",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-4a9f67",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.17-3d5d0d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        