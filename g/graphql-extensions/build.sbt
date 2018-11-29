organization := "com.scalablytyped"
name := "graphql-extensions"
version := "0.3.3-922859"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-cache-control" % "0.3.3-01e01a",
  "com.scalablytyped" %%% "apollo-datasource" % "0.2.1-1961e9",
  "com.scalablytyped" %%% "apollo-engine-reporting" % "0.1.3-9c32e2",
  "com.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.1.0-d6b8ec",
  "com.scalablytyped" %%% "apollo-env" % "0.2.5-34e35a",
  "com.scalablytyped" %%% "apollo-link" % "1.2.4-cf91b1",
  "com.scalablytyped" %%% "apollo-server-caching" % "0.2.1-6b3583",
  "com.scalablytyped" %%% "apollo-server-core" % "2.2.5-c87723",
  "com.scalablytyped" %%% "apollo-server-env" % "2.2.0-5c4544",
  "com.scalablytyped" %%% "apollo-server-errors" % "2.2.0-6993e0",
  "com.scalablytyped" %%% "apollo-server-plugin-base" % "0.1.5-01db18",
  "com.scalablytyped" %%% "apollo-utilities" % "1.0.26-9dddf4",
  "com.scalablytyped" %%% "apollographql__apollo-tools" % "0.2.8-bca946",
  "com.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-8b40c3",
  "com.scalablytyped" %%% "async-retry" % "1.2-dt-20180910Z-483ae3",
  "com.scalablytyped" %%% "backo2" % "1.0-dt-20180910Z-c6e5da",
  "com.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-2f50f6",
  "com.scalablytyped" %%% "deprecated-decorator" % "0.1.6-d4fb36",
  "com.scalablytyped" %%% "eventemitter3" % "3.1.0-88be71",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-dd545c",
  "com.scalablytyped" %%% "graphql-subscriptions" % "1.0.0-ddc3c0",
  "com.scalablytyped" %%% "graphql-tag" % "2.10.0-adf776",
  "com.scalablytyped" %%% "graphql-tools" % "4.0.3-13b271",
  "com.scalablytyped" %%% "iterall" % "1.2.2-e9ddad",
  "com.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180910Z-d73f79",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-aa3127",
  "com.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-cac3f5",
  "com.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-8c9e0c",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-654656",
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
  "com.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-4a1a0f",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-45b962",
  "com.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180910Z-8a2876",
  "com.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-636507",
  "com.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-bc92a5",
  "com.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-854602",
  "com.scalablytyped" %%% "zen-observable-ts" % "0.8.11-bacf6e",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        