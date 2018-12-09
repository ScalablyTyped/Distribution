organization := "org.scalablytyped"
name := "mali"
version := "0.10.2-5d4826"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "destroy" % "1.0-dt-20180910Z-118f69",
  "org.scalablytyped" %%% "grpc" % "1.16.1-7af532",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-9ef893",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180910Z-da8ba8",
  "org.scalablytyped" %%% "lodash_dot_concat" % "4.5-dt-20180910Z-0426f1",
  "org.scalablytyped" %%% "lodash_dot_find" % "4.6-dt-20180910Z-fe90df",
  "org.scalablytyped" %%% "lodash_dot_forown" % "4.4-dt-20180910Z-b86a8c",
  "org.scalablytyped" %%% "lodash_dot_intersection" % "4.4-dt-20180910Z-7ace65",
  "org.scalablytyped" %%% "lodash_dot_isplainobject" % "4.0-dt-20180910Z-e89493",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180910Z-27d6d3",
  "org.scalablytyped" %%% "lodash_dot_pull" % "4.1-dt-20180910Z-4284ba",
  "org.scalablytyped" %%% "lodash_dot_upperfirst" % "4.3-dt-20180910Z-334855",
  "org.scalablytyped" %%% "lodash_dot_values" % "4.3-dt-20180910Z-af27fb",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-387ddd",
  "org.scalablytyped" %%% "mali-compose" % "1.1-dt-20181120Z-1c8d86",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "p-map" % "1.1-dt-20180910Z-9914ab",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180910Z-cb0d57",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-89b4f7",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-27957d",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-8b222a",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-bd1923",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-ce83b4",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-c51d9d",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-22a8a7",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-53afa0",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-b14493",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-6efed3",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-045d53",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        