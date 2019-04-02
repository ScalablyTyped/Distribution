organization := "org.scalablytyped"
name := "mali-onerror"
version := "0.1-dt-20181120Z-546973"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "grpc" % "1.19.0-caa195",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190329Z-69a948",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190214Z-31acdf",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190214Z-3a5aec",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-418504",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-656775",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-7d3a63",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-e9c001",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-7658b2",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-d98038",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-04dd70",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-115d28",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-1fe064",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-aa4a7f",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-87cd30",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-3bda91",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        