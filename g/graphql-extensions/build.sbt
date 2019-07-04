organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.7.6-9e4ff3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-datasource" % "0.5.0-fc5f0a",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.3.5-c55f3d",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.3.1-669761",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-3add98",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.4.0-93f406",
  "org.scalablytyped" %%% "apollo-server-core" % "2.6.7-61051f",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.0-6de18d",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.0-9363cf",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.5.6-8cf26a",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.7-8b782f",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.20-5ee42a",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-ef4b6c",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190624Z-39761a",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-857476",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-26253f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-b52da1",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-dd5473",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-7a20a3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        