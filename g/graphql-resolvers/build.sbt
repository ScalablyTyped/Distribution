organization := "org.scalablytyped"
name := "graphql-resolvers"
version := "0.2-dt-20181024Z-6a82ea"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-4cdbff",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-46ed8a",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-820eb1",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-bbb22f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        