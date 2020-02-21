organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.10.10-9a4618"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-0227ac",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.1-925e96",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-9bade7",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.10-46109f",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-cef0bf",
  "org.scalablytyped" %%% "graphql" % "14.6.0-800d77",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20200122Z-5ea517",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
