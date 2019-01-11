organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-588e33"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-539916",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e3598d",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-e44fee",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-696dbe",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-4071c2",
  "org.scalablytyped" %%% "source-map" % "0.7.3-238ef8",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-7fdc70",
  "org.scalablytyped" %%% "typescript" % "3.2.2-a775a5",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-53ab16",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-78d8cb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        