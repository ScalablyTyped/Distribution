organization := "org.scalablytyped"
name := "jest-axe"
version := "2.2-dt-20181205Z-ba3231"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axe-core" % "3.2.2-cb2835",
  "org.scalablytyped" %%% "jest" % "24.0-dt-20190307Z-d00d7b",
  "org.scalablytyped" %%% "jest-diff" % "20.0-dt-20190212Z-4b7335",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        