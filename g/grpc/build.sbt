organization := "com.scalablytyped"
name := "grpc"
version := "1.15.1-874ced"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-ace41c",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "protobufjs" % "6.8.8-dc0530",
  "com.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-2c7cd8",
  "com.scalablytyped" %%% "protobufjs__base64" % "1.1.2-2c8f62",
  "com.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-63e3a1",
  "com.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-03b0c2",
  "com.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-2abc1b",
  "com.scalablytyped" %%% "protobufjs__float" % "1.0.2-960bf5",
  "com.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-e8e70d",
  "com.scalablytyped" %%% "protobufjs__path" % "1.1.2-c48b13",
  "com.scalablytyped" %%% "protobufjs__pool" % "1.1.0-2fb531",
  "com.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-0af194",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        