organization := "org.scalablytyped"
name := "ldclient-js"
version := "2.8.0-b51943"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180910Z-e0e5f0",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-7b17da",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-0a22d4",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        