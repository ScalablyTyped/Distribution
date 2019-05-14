organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.6.0-31c447"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-datasource" % "0.4.0-7290f9",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.1.0-9a4f9b",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.3.0-2a9d70",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-3e2f2b",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.4.0-0d19d2",
  "org.scalablytyped" %%% "apollo-server-core" % "2.5.0-f5bcfe",
  "org.scalablytyped" %%% "apollo-server-env" % "2.3.0-695e7f",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.0-4cd2fa",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.4.0-ce7a94",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.6-alpha.1-e0ef02",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-c8407a",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-34d51a",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-06a24b",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-18143d",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190513Z-e9c6e7",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-303c7d",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-91999d",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-04fd62",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-6e8907")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        