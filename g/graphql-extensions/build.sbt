organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.7.2-6156ef"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-datasource" % "0.5.0-fc5f0a",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.3.1-14985e",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.3.1-669761",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-644548",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.4.0-93f406",
  "org.scalablytyped" %%% "apollo-server-core" % "2.6.3-883047",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.0-51b426",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.0-f6f813",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.5.2-8cf26a",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.7-bb544b",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.20-5ee42a",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-ef4b6c",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190616Z-f0ece1",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-549a68",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-26253f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-2e8905",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-a66a28",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-7a20a3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        