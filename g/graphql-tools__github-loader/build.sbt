organization := "org.scalablytyped"
name := "graphql-tools__github-loader"
version := "6.0.15-1d54d3"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__parser" % "7.11.0-0fe02f",
  "org.scalablytyped" %%% "babel__types" % "7.11.0-b7a397",
  "org.scalablytyped" %%% "graphql" % "15.3.0-ff42a4",
  "org.scalablytyped" %%% "graphql-tools__graphql-tag-pluck" % "6.0.15-842720",
  "org.scalablytyped" %%% "graphql-tools__utils" % "6.0.15-4d454d",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
