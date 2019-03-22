organization := "org.scalablytyped"
name := "grpc"
version := "1.19.0-822d98"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190214Z-e15c6b",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190214Z-4fd6b5",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-b30bce",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-88ab7e",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-6d28c3",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-46201f",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-63857b",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-fe2693",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-c2c6bd",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-3b892b",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-97bb93",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-8051ed",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-7152e5",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-1df087",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        