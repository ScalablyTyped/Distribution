organization := "org.scalablytyped"
name := "mali-onerror"
version := "0.1-dt-20181120Z-3c9e5d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "destroy" % "1.0-dt-20180910Z-984b67",
  "org.scalablytyped" %%% "grpc" % "1.16.1-4d8b49",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-014c96",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180910Z-2d6420",
  "org.scalablytyped" %%% "lodash_dot_concat" % "4.5-dt-20180910Z-8802a4",
  "org.scalablytyped" %%% "lodash_dot_find" % "4.6-dt-20180910Z-62618c",
  "org.scalablytyped" %%% "lodash_dot_forown" % "4.4-dt-20180910Z-0b6afc",
  "org.scalablytyped" %%% "lodash_dot_intersection" % "4.4-dt-20180910Z-108e72",
  "org.scalablytyped" %%% "lodash_dot_isplainobject" % "4.0-dt-20180910Z-f41887",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180910Z-5a963a",
  "org.scalablytyped" %%% "lodash_dot_pull" % "4.1-dt-20180910Z-4ef13f",
  "org.scalablytyped" %%% "lodash_dot_upperfirst" % "4.3-dt-20180910Z-ef27a6",
  "org.scalablytyped" %%% "lodash_dot_values" % "4.3-dt-20180910Z-5ee29e",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-76729d",
  "org.scalablytyped" %%% "mali" % "0.10.2-78f5b0",
  "org.scalablytyped" %%% "mali-compose" % "1.1-dt-20181120Z-81e496",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "p-map" % "1.1-dt-20180910Z-0eb83d",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180910Z-34029a",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e1d881",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-9b70f4",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-2605b5",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-8a3782",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-000df5",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-ddce07",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-be31e2",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-b25b54",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-b26c77",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-ddd0b7",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-c727dc",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        