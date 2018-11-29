organization := "com.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-alpha.3-fdac76"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-colors" % "1.0-dt-20180910Z-76f963",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-8a7f1f",
  "com.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-c0de3f",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-5ec0b9",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "plugin-error" % "0.1-dt-20180910Z-f45bb0",
  "com.scalablytyped" %%% "source-map" % "0.7.3-ecab3d",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-15ecbb",
  "com.scalablytyped" %%% "typescript" % "3.2.1-5cd657",
  "com.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-a0b930",
  "com.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-75e812",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        