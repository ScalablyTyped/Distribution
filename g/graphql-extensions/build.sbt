organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.3.3-b90b43"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.3.3-ba855a",
  "org.scalablytyped" %%% "apollo-datasource" % "0.2.1-7713b8",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "0.1.3-8f9224",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.1.0-53f042",
  "org.scalablytyped" %%% "apollo-env" % "0.2.5-5045f9",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-f5ddbe",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.2.1-537c8c",
  "org.scalablytyped" %%% "apollo-server-core" % "2.2.6-0dc559",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-22da02",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.2.0-676f7d",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.1.6-5898df",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-181e22",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.2.8-a8f4a8",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-855ae1",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180910Z-a4da22",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180910Z-f0cc66",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-50a955",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-e6f621",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-309cca",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-f94ee7",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.0.0-e016dc",
  "org.scalablytyped" %%% "graphql-tag" % "2.10.0-f1fc76",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.3-152255",
  "org.scalablytyped" %%% "iterall" % "1.2.2-5ff71a",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180910Z-d90990",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-76729d",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180910Z-d054fb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-dbcdca",
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
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-15f3aa",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-46014e",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180910Z-ee6e48",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-00c113",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-85e500",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-cf13fe",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-203351")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        