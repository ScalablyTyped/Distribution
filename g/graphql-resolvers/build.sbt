organization := "org.scalablytyped"
name := "graphql-resolvers"
version := "0.3-dt-20200521Z-0e8e37"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-a26a1b",
  "org.scalablytyped" %%% "graphql" % "14.6.0-2fa9e2",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.8-91e34a",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-118859")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
