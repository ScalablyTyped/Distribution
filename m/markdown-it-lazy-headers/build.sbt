organization := "org.scalablytyped"
name := "markdown-it-lazy-headers"
version := "0.13-dt-20181102Z-b17cfa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20190326Z-6b8f4c",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20190322Z-dff6ed",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        