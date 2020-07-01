organization := "org.scalablytyped"
name := "graphql-binding"
version := "2.5.2-a5934c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-6f7d74",
  "org.scalablytyped" %%% "ava" % "3.9.0-6602e0",
  "org.scalablytyped" %%% "graphql" % "14.6.0-578a82",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.8-fed09b",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-71140e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
