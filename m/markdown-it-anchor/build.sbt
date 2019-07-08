organization := "org.scalablytyped"
name := "markdown-it-anchor"
version := "4.0-dt-20181102Z-c91855"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20190326Z-c0b823",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20190701Z-cd07b2",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        