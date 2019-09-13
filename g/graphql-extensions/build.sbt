organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.10.3-423e92"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.0-4a2a3e",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-a17842",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-3c8fde",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.4-c37f37",
  "org.scalablytyped" %%% "graphql" % "14.5.4-73f550",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e83d9b",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        