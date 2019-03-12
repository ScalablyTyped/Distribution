organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.2-00e572"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-65a65c",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-21c6be",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180510Z-b27a46",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-de4eb5",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-2b30b5",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-334b9b",
  "org.scalablytyped" %%% "handlebars" % "4.1.0-d994a7",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-36c82d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190307Z-48199e",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-ebcd79",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-ec3c08",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-7bc935",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190212Z-94f16c",
  "org.scalablytyped" %%% "source-map" % "0.7.3-169991",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "typedoc" % "0.14.2-4b6555",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-09c87f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        