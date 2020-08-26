organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.12.4-6ea3f7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.5.2-f7b4fe",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.2-7e5dcc",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.5-a0e1f0",
  "org.scalablytyped" %%% "apollo-server-types" % "0.5.1-436cd9",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.4-a10f15",
  "org.scalablytyped" %%% "graphql" % "15.3.0-ff42a4",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200515Z-c59689",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
