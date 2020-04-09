organization := "org.scalablytyped"
name := "joigoose"
version := "2.0-dt-20191003Z-caf6e2"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20200319Z-0ad0eb",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20200227Z-0b3433",
  "org.scalablytyped" %%% "mongodb" % "3.5-dt-20200407Z-4582db",
  "org.scalablytyped" %%% "mongoose" % "5.7.12-dt-20200327Z-b1e6b1",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
