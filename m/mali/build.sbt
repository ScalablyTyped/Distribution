organization := "org.scalablytyped"
name := "mali"
version := "0.10.2-f6275b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "destroy" % "1.0-dt-20180910Z-f4f08f",
  "org.scalablytyped" %%% "grpc" % "1.16.1-ab6594",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-183e9d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180910Z-450643",
  "org.scalablytyped" %%% "lodash_dot_concat" % "4.5-dt-20180910Z-a351ad",
  "org.scalablytyped" %%% "lodash_dot_find" % "4.6-dt-20180910Z-84fbee",
  "org.scalablytyped" %%% "lodash_dot_forown" % "4.4-dt-20180910Z-fcd22b",
  "org.scalablytyped" %%% "lodash_dot_intersection" % "4.4-dt-20180910Z-a4c730",
  "org.scalablytyped" %%% "lodash_dot_isplainobject" % "4.0-dt-20180910Z-c724d9",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180910Z-fa457c",
  "org.scalablytyped" %%% "lodash_dot_pull" % "4.1-dt-20180910Z-0711a9",
  "org.scalablytyped" %%% "lodash_dot_upperfirst" % "4.3-dt-20180910Z-2d90db",
  "org.scalablytyped" %%% "lodash_dot_values" % "4.3-dt-20180910Z-7a66ef",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-153ce0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "p-map" % "1.1-dt-20180910Z-9a84f5",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180910Z-307b85",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e136ca",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-d3e3b2",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-d9ae65",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-d4193a",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-907098",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-407e0b",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-bc95c4",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-cf41d5",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-632fdf",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-ccad89",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-51b4ae",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        