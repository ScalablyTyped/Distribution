organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.4.0-79d6a7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.4.0-3eb62b",
  "org.scalablytyped" %%% "apollo-datasource" % "0.2.1-ef69ba",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "0.2.0-731dc1",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.0-812a12",
  "org.scalablytyped" %%% "apollo-env" % "0.2.5-4d3598",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-5dd416",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.2.1-a9b51c",
  "org.scalablytyped" %%% "apollo-server-core" % "2.3.1-221cf4",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-3c897e",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.2.0-caa260",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.2.1-02374e",
  "org.scalablytyped" %%% "apollo-tracing" % "0.4.0-d8369d",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-084adf",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.2.9-1989d7",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-88cf76",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180601Z-a2ffdc",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-f25749",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-96442c",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-b3331e",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-50d79a",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181016Z-3245d4",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.0.0-1778b2",
  "org.scalablytyped" %%% "graphql-tag" % "2.10.0-9b8191",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.3-31ceb4",
  "org.scalablytyped" %%% "iterall" % "1.2.2-b891ad",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180214Z-5f9731",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-a0b1b2",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-759fd7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-d6edb6",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-8af596",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-eb4ed7",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-8265ef",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-a9eb67",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-b99416",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-c7db0b",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-29d2d9",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-db95a2",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-65a6ba",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-4b21fc",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-21d69c",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-1d6d8a",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-43e3c6",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-00c85d",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-6a551f",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-790def",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-76c70f",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-850d40")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        