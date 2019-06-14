organization := "org.scalablytyped"
name := "marked-terminal"
version := "3.1-dt-20181217Z-01ae2c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6f5c69",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190403Z-aa671e",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        