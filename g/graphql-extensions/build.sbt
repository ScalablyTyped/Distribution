organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.7.2-1980f7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-datasource" % "0.5.0-f51c6c",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.3.1-77467b",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.3.1-6ec230",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-bede40",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.4.0-0979b9",
  "org.scalablytyped" %%% "apollo-server-core" % "2.6.3-8ed09a",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.0-3db4d7",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.0-50ce2d",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.5.2-b4cb41",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.7-2d5b77",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.20-f9a28a",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-05bf94",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190616Z-a68a9c",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-e2f142",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-01bc11",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-e6990b",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-cb6c46",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-4da704")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        