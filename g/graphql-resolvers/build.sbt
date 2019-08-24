organization := "org.scalablytyped"
name := "graphql-resolvers"
version := "0.2-dt-20190801Z-8466e1"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-f86490",
  "org.scalablytyped" %%% "graphql" % "14.5.3-be513a",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-f01933",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-002886")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        