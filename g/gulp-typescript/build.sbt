organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-d156f5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "1.0-dt-20180910Z-4f7c51",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-a33ba6",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-c295f5",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-45414c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180910Z-4db107",
  "org.scalablytyped" %%% "source-map" % "0.7.3-6ade85",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-f1d5dc",
  "org.scalablytyped" %%% "typescript" % "3.2.2-445e51",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-9f101b",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-91125b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        