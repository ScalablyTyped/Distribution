organization := "org.scalablytyped"
name := "html-webpack-plugin"
version := "3.2-dt-20181121Z-c15521"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-47e07f",
  "org.scalablytyped" %%% "clean-css" % "v3.4.9-dt-20180214Z-229815",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20181017Z-0c0063",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20180214Z-087bd8",
  "org.scalablytyped" %%% "source-map" % "0.7.3-242c07",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-48b551",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-603838",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-7f54f8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        