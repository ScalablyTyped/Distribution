organization := "org.scalablytyped"
name := "mali-compose"
version := "1.1-dt-20181120Z-892e8f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "grpc" % "1.18.0-c89e8c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-ab1fa3",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-153059",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-02eb4a",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-49639d",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-e26d13",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-6367f2",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-8a9473",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-ee2249",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-b87ef3",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-e0df27",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-f2eb3d",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-7cc4d0",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-22c235",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-9c4942",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        