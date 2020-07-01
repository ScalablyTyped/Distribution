organization := "org.scalablytyped"
name := "intl-messageformat"
version := "7.8.4-e90997"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.2.0-af1250",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.2.0-d8d037",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.6.4-ce2a2b",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
