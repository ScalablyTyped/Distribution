organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-4ee01a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-82f58f",
  "org.scalablytyped" %%% "inversify" % "5.0.1-e4d8ea",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191024Z-380862",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-3e6ca6",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        