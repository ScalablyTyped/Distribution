organization := "org.scalablytyped"
name := "grpc__proto-loader"
version := "0.3.0-92934f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-c30cf6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-770897",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-c931e6",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-5e843a",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-30774a",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-592e97",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-e194a5",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-9d3553",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-1d4f93",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-35f35b",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-eddee7",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-946a5f",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        