organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.6.1-03c87a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-datasource" % "0.4.0-5f9b2e",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.1.1-6dbcbd",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.3.0-9d4009",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-1d20bf",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.4.0-9a03c0",
  "org.scalablytyped" %%% "apollo-server-core" % "2.5.1-e202c3",
  "org.scalablytyped" %%% "apollo-server-env" % "2.3.0-ddd4d6",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.0-bb956c",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.4.1-d591ff",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.7-c18c31",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.20-d8a927",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-081994",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-a67bc6",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-83e0be",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-6b3290",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-4af3d9",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-439372",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-7ac41d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        