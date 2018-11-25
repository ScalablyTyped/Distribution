organization := "com.scalablytyped"
name := "html-webpack-template"
version := "6.0-dt-20180910Z-1bee94"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-335bc8",
  "com.scalablytyped" %%% "clean-css" % "v3.4.9-dt-20180910Z-f6c40e",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "html-minifier" % "3.5-dt-20180910Z-df7c8b",
  "com.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-dc6f5a",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20180910Z-32e068",
  "com.scalablytyped" %%% "source-map" % "0.7.3-2a06d1",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-aab6b2",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-3bc20d",
  "com.scalablytyped" %%% "webpack" % "4.4-dt-20181116Z-1b7f4c",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        