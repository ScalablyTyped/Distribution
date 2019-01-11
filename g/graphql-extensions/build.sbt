organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.4.0-cd6c24"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-datasource" % "0.2.1-38cfd5",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "0.2.0-3db128",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.0-1af0ad",
  "org.scalablytyped" %%% "apollo-env" % "0.2.5-3027d4",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-512db1",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.2.1-145a8d",
  "org.scalablytyped" %%% "apollo-server-core" % "2.3.1-6fc0fa",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-1491ac",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.2.0-2610cb",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.2.1-b389bc",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-c80c1a",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.2.9-e8e4f7",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-ba53dc",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180601Z-42ddd4",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-4fbb23",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-32e609",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-b7188f",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-10d18d",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-42ebaa",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-cb936f",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.0.0-d02359",
  "org.scalablytyped" %%% "graphql-tag" % "2.10.0-ee66b6",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.3-6ec678",
  "org.scalablytyped" %%% "iterall" % "1.2.2-d67a65",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180214Z-bffb33",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-3de878",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-038998",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-ba4b99",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-959624",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-4cbd9a",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-e150cf",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-0743f6",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-777313",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-494ba5",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-e0366f",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-add352",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-339b33",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-6dadc2",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-1db5b2",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-8d9e37",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e21f3d",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-e1edf0",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-7936ed",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-641db8",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-1f070e",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-94c887")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        