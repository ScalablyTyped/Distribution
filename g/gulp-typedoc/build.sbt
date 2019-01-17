organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.1-a0d2c8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-539916",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180510Z-ccea4d",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20180214Z-ac63b5",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-95ed7f",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e3598d",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20181213Z-e1071c",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-b36296",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190102Z-e5b2fb",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-696dbe",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-4071c2",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-d4c14b",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20181206Z-854571",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "typedoc" % "0.14.2-1267d4",
  "org.scalablytyped" %%% "typescript" % "3.2.2-65de7b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        