organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.2-64b41c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-65a65c",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20190322Z-9cc02e",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-de4eb5",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-8c7bf5",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ab02fa",
  "org.scalablytyped" %%% "handlebars" % "4.1.1-560063",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20190322Z-36c82d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190307Z-48199e",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20190322Z-ebcd79",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-ec3c08",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20190322Z-498315",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190212Z-5b8443",
  "org.scalablytyped" %%% "source-map" % "0.7.3-169991",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "typedoc" % "0.14.2-709689",
  "org.scalablytyped" %%% "typescript" % "3.3.4000-09c87f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        