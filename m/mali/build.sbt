organization := "com.scalablytyped"
name := "mali"
version := "0.10.2-fe6af4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "destroy" % "1.0-dt-20180910Z-545077",
  "com.scalablytyped" %%% "grpc" % "1.16.1-b03b84",
  "com.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-793f94",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-0335c2",
  "com.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180910Z-753d66",
  "com.scalablytyped" %%% "lodash_dot_concat" % "4.5-dt-20180910Z-381210",
  "com.scalablytyped" %%% "lodash_dot_find" % "4.6-dt-20180910Z-46fecb",
  "com.scalablytyped" %%% "lodash_dot_forown" % "4.4-dt-20180910Z-0f51f2",
  "com.scalablytyped" %%% "lodash_dot_intersection" % "4.4-dt-20180910Z-107a29",
  "com.scalablytyped" %%% "lodash_dot_isplainobject" % "4.0-dt-20180910Z-74349f",
  "com.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180910Z-4644c0",
  "com.scalablytyped" %%% "lodash_dot_pull" % "4.1-dt-20180910Z-93cab0",
  "com.scalablytyped" %%% "lodash_dot_upperfirst" % "4.3-dt-20180910Z-4679e4",
  "com.scalablytyped" %%% "lodash_dot_values" % "4.3-dt-20180910Z-000982",
  "com.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-cac3f5",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "p-map" % "1.1-dt-20180910Z-6f0117",
  "com.scalablytyped" %%% "pify" % "3.0.0-dt-20180910Z-6e073d",
  "com.scalablytyped" %%% "protobufjs" % "6.8.8-ee9f43",
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
        