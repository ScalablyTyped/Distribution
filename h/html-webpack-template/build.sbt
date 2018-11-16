organization := "com.scalablytyped"
name := "html-webpack-template"
version := "6.0-dt-20181102Z-1e76bd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "anymatch" % "1.3-dt-20181102Z-81c269",
  "com.scalablytyped" %%% "clean-css" % "v3.4.9-dt-20181102Z-2fda4a",
  "com.scalablytyped" %%% "html-minifier" % "3.5-dt-20181102Z-a918b8",
  "com.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181102Z-ee42c2",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20181102Z-10985c",
  "com.scalablytyped" %%% "source-map" % "0.7.3-771552",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "tapable" % "v1.0.0-dt-20181102Z-d10221",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181102Z-f3dae8",
  "com.scalablytyped" %%% "webpack" % "4.4-dt-20181116Z-80c872",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        