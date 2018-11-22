organization := "com.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-alpha.3-15de80"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-colors" % "1.0-dt-20180910Z-de71dc",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-cc6273",
  "com.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-00e858",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-298c87",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "plugin-error" % "0.1-dt-20180910Z-4a4834",
  "com.scalablytyped" %%% "source-map" % "0.7.3-2a06d1",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-36328f",
  "com.scalablytyped" %%% "typescript" % "3.1.3-c44b5f",
  "com.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-e8fbb3",
  "com.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-80ea7b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        