organization := "org.scalablytyped"
name := "material__tab-bar"
version := "7.0.0-5caba2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "7.0.0-39ae3e",
  "org.scalablytyped" %%% "material__ripple" % "7.0.0-0434fd",
  "org.scalablytyped" %%% "material__tab" % "7.0.0-ad09e3",
  "org.scalablytyped" %%% "material__tab-indicator" % "7.0.0-3ccf6d",
  "org.scalablytyped" %%% "material__tab-scroller" % "7.0.0-0a00b7",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
