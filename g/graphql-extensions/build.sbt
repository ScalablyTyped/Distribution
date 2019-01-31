organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.4.2-4dc1ec"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-datasource" % "0.2.2-3f0c62",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "0.2.1-e585b2",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.0-d02117",
  "org.scalablytyped" %%% "apollo-env" % "0.3.0-efb85f",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-cc52df",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.2.2-0350a9",
  "org.scalablytyped" %%% "apollo-server-core" % "2.3.3-9f34bc",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-de19fc",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.2.0-0e8cc0",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.2.3-384992",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-66344e",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.0-1a5b3a",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-d30438",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180601Z-370694",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-7e0647",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-f27478",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-da91f3",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-3e97b7",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ddf996",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190107Z-5c65a8",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.0.0-f74b3b",
  "org.scalablytyped" %%% "graphql-tag" % "2.10.0-3e6761",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-63429c",
  "org.scalablytyped" %%% "iterall" % "1.2.2-4373bf",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-e44ec3",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-167463",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-93f77e",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-7966c6",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-c09989",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-991424",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-e42de9",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-e729e8",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-27c8f0",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-bf95d8",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-4a99f0",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-01c06c",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-503643",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-6d707c",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-09887b",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-607a2a",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-3366c4",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-29e273",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-b07b2e",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-0cbed1",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-29c689")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        