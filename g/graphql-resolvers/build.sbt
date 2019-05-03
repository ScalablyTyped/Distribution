organization := "org.scalablytyped"
name := "graphql-resolvers"
version := "0.2-dt-20181024Z-ecb8a9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-3e2f2b",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-06a24b",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-18143d",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-6e8907")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        