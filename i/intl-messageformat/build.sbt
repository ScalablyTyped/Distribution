organization := "org.scalablytyped"
name := "intl-messageformat"
version := "7.7.5-c659bd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.0.0-bd6ed8",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.0.0-a08574",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.5.2-3e00f0",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        