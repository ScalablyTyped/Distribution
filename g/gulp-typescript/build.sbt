organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-d4faac"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-56784a",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ef1d9b",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-793fb8",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-753f08",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-41a1ce",
  "org.scalablytyped" %%% "source-map" % "0.7.3-fc8207",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-99d098",
  "org.scalablytyped" %%% "typescript" % "3.2.2-aeda64",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-ca5832",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-8ee57c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        