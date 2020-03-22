organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-4124bf"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200226Z-746b2c",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20200225Z-a314e8",
  "org.scalablytyped" %%% "inversify" % "5.0.1-427422",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20200225Z-dc03f4",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20200227Z-2c8a7a",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
