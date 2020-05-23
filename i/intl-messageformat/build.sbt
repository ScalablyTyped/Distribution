organization := "org.scalablytyped"
name := "intl-messageformat"
version := "7.8.4-082a2a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.2.0-31f22d",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.2.0-915d9f",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.6.4-346590",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
