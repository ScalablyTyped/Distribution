organization := "org.scalablytyped"
name := "graphql-resolvers"
version := "0.2-dt-20181024Z-5e02f8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-527c94",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-3e2174",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-4472f3",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-508485")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        