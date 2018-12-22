organization := "org.scalablytyped"
name := "ldclient-js"
version := "2.8.0-65261c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-4b0ce1",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-cb7b0b",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-dc1557",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        