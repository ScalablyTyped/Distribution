organization := "org.scalablytyped"
name := "material__textfield"
version := "7.0.0-4dc2d0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "7.0.0-39ae3e",
  "org.scalablytyped" %%% "material__floating-label" % "7.0.0-049dd3",
  "org.scalablytyped" %%% "material__line-ripple" % "7.0.0-ce8de9",
  "org.scalablytyped" %%% "material__notched-outline" % "7.0.0-4bfa79",
  "org.scalablytyped" %%% "material__ripple" % "7.0.0-0434fd",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
