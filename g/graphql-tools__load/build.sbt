organization := "org.scalablytyped"
name := "graphql-tools__load"
version := "6.0.15-390241"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "graphql" % "15.3.0-ff42a4",
  "org.scalablytyped" %%% "graphql-tools__merge" % "6.0.15-47823b",
  "org.scalablytyped" %%% "graphql-tools__schema" % "6.0.15-6e3d37",
  "org.scalablytyped" %%% "graphql-tools__utils" % "6.0.15-4d454d",
  "org.scalablytyped" %%% "p-limit" % "3.0.2-45009f",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
