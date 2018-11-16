organization := "com.scalablytyped"
name := "html-minifier"
version := "3.5-dt-20181102Z-a918b8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "clean-css" % "v3.4.9-dt-20181102Z-2fda4a",
  "com.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20181102Z-10985c",
  "com.scalablytyped" %%% "source-map" % "0.7.3-771552",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181102Z-f3dae8",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        