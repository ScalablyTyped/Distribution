organization := "org.scalablytyped"
name := "html-minifier"
version := "3.5-dt-20180910Z-6cc182"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "clean-css" % "v3.4.9-dt-20180910Z-b157f3",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20180910Z-2f04ee",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4f6afc",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-ca77c5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        