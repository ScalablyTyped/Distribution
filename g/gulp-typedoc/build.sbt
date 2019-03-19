organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.2-9b78e0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-65a65c",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180510Z-0f7a9d",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-de4eb5",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-50456b",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-cd72cc",
  "org.scalablytyped" %%% "handlebars" % "4.1.1-d101f5",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-36c82d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190307Z-48199e",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-ebcd79",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-ec3c08",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-3dfccb",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190212Z-592da5",
  "org.scalablytyped" %%% "source-map" % "0.7.3-169991",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "typedoc" % "0.14.2-5fa6e8",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-09c87f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        