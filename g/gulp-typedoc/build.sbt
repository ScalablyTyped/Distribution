organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.1-dd9ab2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "1.0-dt-20180214Z-0137d0",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180510Z-fa2dad",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20180214Z-7ae8cc",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-31009f",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ef1d9b",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20181213Z-f3274a",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-3bf600",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "marked" % "0.5-dt-20181204Z-c14d15",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-753f08",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-41a1ce",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-f305d8",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20181206Z-263189",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "typedoc" % "0.13.0-aafa6d",
  "org.scalablytyped" %%% "typescript" % "3.2.2-aeda64")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        