organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.5.7-c78f0f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-datasource" % "0.3.1-6a8440",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.0.7-f306bb",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.1-bde160",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-4cdbff",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.3.1-0bd504",
  "org.scalablytyped" %%% "apollo-server-core" % "2.4.8-a76c6f",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-180868",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.2.1-bf7ad8",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.3.7-bb77f0",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.5-4bb32c",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-fb6f54",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-a54109",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-46ed8a",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-820eb1",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-203cdf",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-b9803f",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-bda8a6",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-bbb22f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        