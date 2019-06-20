organization := "org.scalablytyped"
name := "markdown-it-container"
version := "2.0-dt-20181102Z-c631ae"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20190326Z-e968f7",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20190322Z-e87cec",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        