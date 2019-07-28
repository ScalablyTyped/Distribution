organization := "org.scalablytyped"
name := "graphql-resolvers"
version := "0.2-dt-20181024Z-e6132c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-16bcb2",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190722Z-fd24a4",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.5-7862ab",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-871dff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        