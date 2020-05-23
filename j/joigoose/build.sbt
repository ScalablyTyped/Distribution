organization := "org.scalablytyped"
name := "joigoose"
version := "2.0-dt-20200515Z-5f56a7"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20200515Z-350996",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20200515Z-89560b",
  "org.scalablytyped" %%% "mongodb" % "3.5-dt-20200518Z-17cb2a",
  "org.scalablytyped" %%% "mongoose" % "5.7.13-dt-20200519Z-cfec27",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
