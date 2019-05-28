organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.6.0-952880"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-datasource" % "0.4.0-7290f9",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.1.0-ad6b62",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.3.0-c01486",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-987548",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.4.0-0d19d2",
  "org.scalablytyped" %%% "apollo-server-core" % "2.5.0-2954db",
  "org.scalablytyped" %%% "apollo-server-env" % "2.3.0-72a082",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.0-4aaecb",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.4.0-ce7a94",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.7-5d496c",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.18-3711a6",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-34d51a",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-3a9110",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-e913ea",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-2c1544",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-551006",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-fb977b",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-6e8907")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        