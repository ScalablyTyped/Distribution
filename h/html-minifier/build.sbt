organization := "com.scalablytyped"
name := "html-minifier"
version := "3.5-dt-20180910Z-df7c8b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "clean-css" % "v3.4.9-dt-20180910Z-f6c40e",
  "com.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20180910Z-32e068",
  "com.scalablytyped" %%% "source-map" % "0.7.3-2a06d1",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-3bc20d",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        