organization := "org.scalablytyped"
name := "graphql-resolvers"
version := "0.2-dt-20181024Z-cba01d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-644548",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190616Z-f0ece1",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-549a68",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-7a20a3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        