organization := "com.scalablytyped"
name := "gulp-typedoc"
version := "2.2.0-7b8bc3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-colors" % "1.0-dt-20180910Z-de71dc",
  "com.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180910Z-8a4420",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "fancy-log" % "1.3-dt-20180910Z-766b72",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-9b03c0",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-5d44f9",
  "com.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20180910Z-cd8e60",
  "com.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180910Z-f0675f",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "marked" % "0.4-dt-20181002Z-2dc896",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-298c87",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "plugin-error" % "0.1-dt-20180910Z-4a4834",
  "com.scalablytyped" %%% "progress" % "v2.0.0-dt-20180910Z-b76ba6",
  "com.scalablytyped" %%% "shelljs" % "0.8-dt-20181121Z-46000f",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "typedoc" % "0.13.0-fccd40",
  "com.scalablytyped" %%% "typescript" % "3.1.3-c44b5f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        