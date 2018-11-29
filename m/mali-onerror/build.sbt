organization := "com.scalablytyped"
name := "mali-onerror"
version := "0.1-dt-20181120Z-c0b226"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "destroy" % "1.0-dt-20180910Z-93b483",
  "com.scalablytyped" %%% "grpc" % "1.16.1-638629",
  "com.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-7e82fe",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-aa3127",
  "com.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180910Z-79552e",
  "com.scalablytyped" %%% "lodash_dot_concat" % "4.5-dt-20180910Z-8fb552",
  "com.scalablytyped" %%% "lodash_dot_find" % "4.6-dt-20180910Z-1d3572",
  "com.scalablytyped" %%% "lodash_dot_forown" % "4.4-dt-20180910Z-c51c1c",
  "com.scalablytyped" %%% "lodash_dot_intersection" % "4.4-dt-20180910Z-281e64",
  "com.scalablytyped" %%% "lodash_dot_isplainobject" % "4.0-dt-20180910Z-04eb2b",
  "com.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180910Z-e1532f",
  "com.scalablytyped" %%% "lodash_dot_pull" % "4.1-dt-20180910Z-1076da",
  "com.scalablytyped" %%% "lodash_dot_upperfirst" % "4.3-dt-20180910Z-383b57",
  "com.scalablytyped" %%% "lodash_dot_values" % "4.3-dt-20180910Z-f95c7a",
  "com.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-cac3f5",
  "com.scalablytyped" %%% "mali" % "0.10.2-041f9a",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "p-map" % "1.1-dt-20180910Z-6f0117",
  "com.scalablytyped" %%% "pify" % "3.0.0-dt-20180910Z-6e073d",
  "com.scalablytyped" %%% "protobufjs" % "6.8.8-183195",
  "com.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-f1a9b6",
  "com.scalablytyped" %%% "protobufjs__base64" % "1.1.2-b9574f",
  "com.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-bc632a",
  "com.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-f0b1ba",
  "com.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-7e30cc",
  "com.scalablytyped" %%% "protobufjs__float" % "1.0.2-e23db2",
  "com.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-dd54d5",
  "com.scalablytyped" %%% "protobufjs__path" % "1.1.2-e3ab94",
  "com.scalablytyped" %%% "protobufjs__pool" % "1.1.0-26d6db",
  "com.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-778e95",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        