organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.1-d1118e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "1.0-dt-20180910Z-89fb0d",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180910Z-0821a0",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20180910Z-fb624b",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-624f1c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-274633",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20180910Z-f427c9",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180910Z-e7afbd",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "marked" % "0.5-dt-20181204Z-e7d527",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-c002a7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180910Z-4aae9f",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181214Z-65ba00",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20181206Z-eb47a3",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "typedoc" % "0.13.0-88167c",
  "org.scalablytyped" %%% "typescript" % "3.2.2-542c62")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        