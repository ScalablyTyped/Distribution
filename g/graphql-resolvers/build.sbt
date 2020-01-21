organization := "org.scalablytyped"
name := "graphql-resolvers"
version := "0.2-dt-20190827Z-4badaf"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-c36848",
  "org.scalablytyped" %%% "graphql" % "14.5.8-ac6a9e",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.6-ead7be",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-610cde")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        