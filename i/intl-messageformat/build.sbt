organization := "org.scalablytyped"
name := "intl-messageformat"
version := "7.8.2-cceebc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.0.4-8bcd30",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.0.4-f8e8e6",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.6.2-898a7b",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        