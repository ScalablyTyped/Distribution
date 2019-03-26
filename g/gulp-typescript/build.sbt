organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.1-b1f782"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-4c57d8",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-805214",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-97177b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-cec35d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-ce2f76",
  "org.scalablytyped" %%% "source-map" % "0.7.3-aac742",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-15c8b6",
  "org.scalablytyped" %%% "typescript" % "3.3.4000-bb3585",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-80129d",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-63a551")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        