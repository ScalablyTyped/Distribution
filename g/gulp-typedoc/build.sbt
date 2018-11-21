organization := "com.scalablytyped"
name := "gulp-typedoc"
version := "2.2.0-4de29e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-colors" % "1.0-dt-20180910Z-de71dc",
  "com.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180910Z-72a061",
  "com.scalablytyped" %%% "fancy-log" % "1.3-dt-20180910Z-766b72",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-2ba264",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-1b2f14",
  "com.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20180910Z-cd8e60",
  "com.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180910Z-f0675f",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "marked" % "0.4-dt-20181002Z-2dc896",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-298c87",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "plugin-error" % "0.1-dt-20180910Z-4a4834",
  "com.scalablytyped" %%% "progress" % "v2.0.0-dt-20180910Z-4813c9",
  "com.scalablytyped" %%% "shelljs" % "0.8-dt-20180910Z-1cfe61",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "typedoc" % "0.13.0-bbaf2d",
  "com.scalablytyped" %%% "typescript" % "3.1.3-c44b5f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        