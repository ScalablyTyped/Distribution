organization := "org.scalablytyped"
name := "mali-compose"
version := "1.1-dt-20181120Z-188716"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "grpc" % "1.19.0-b0dc86",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190214Z-9cda2a",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190214Z-d34993",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-5e7d19",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-74d5c7",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-3fda9f",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-a553ba",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-44776c",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-1fbdf8",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-233427",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-27bccb",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-3d4587",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-052e31",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-c26550",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-52025e",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        