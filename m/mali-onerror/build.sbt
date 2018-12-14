organization := "org.scalablytyped"
name := "mali-onerror"
version := "0.1-dt-20181120Z-3c363e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "destroy" % "1.0-dt-20180910Z-70da97",
  "org.scalablytyped" %%% "grpc" % "1.16.1-a3e5e7",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-6472ea",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180910Z-da607b",
  "org.scalablytyped" %%% "lodash_dot_concat" % "4.5-dt-20180910Z-3a43f7",
  "org.scalablytyped" %%% "lodash_dot_find" % "4.6-dt-20180910Z-d52fde",
  "org.scalablytyped" %%% "lodash_dot_forown" % "4.4-dt-20180910Z-eb6f81",
  "org.scalablytyped" %%% "lodash_dot_intersection" % "4.4-dt-20180910Z-c59d76",
  "org.scalablytyped" %%% "lodash_dot_isplainobject" % "4.0-dt-20180910Z-5aefbf",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180910Z-f2f700",
  "org.scalablytyped" %%% "lodash_dot_pull" % "4.1-dt-20180910Z-21e152",
  "org.scalablytyped" %%% "lodash_dot_upperfirst" % "4.3-dt-20180910Z-910b13",
  "org.scalablytyped" %%% "lodash_dot_values" % "4.3-dt-20180910Z-cd3c21",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-3aa15f",
  "org.scalablytyped" %%% "mali" % "0.10.2-b0cb91",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "p-map" % "1.1-dt-20180910Z-465d3a",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180910Z-4b586c",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-1bac39",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-cf39e8",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-d7cd87",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-a2281d",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-eacc8a",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-9682d2",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-1d2334",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-fec06d",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-e6bd96",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-c28576",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-21ec1b",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        