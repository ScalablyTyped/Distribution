organization := "org.scalablytyped"
name := "graphql-resolvers"
version := "0.2-dt-20190827Z-bed523"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-3e9d24",
  "org.scalablytyped" %%% "graphql" % "14.5.8-92eff2",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.6-addc65",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-760cc5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        