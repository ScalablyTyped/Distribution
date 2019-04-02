organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.1-2e38bc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-53fbc6",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ce8e08",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-6a3a24",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-7a822c",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1b6210",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-d326d3",
  "org.scalablytyped" %%% "typescript" % "3.4.1-a42773",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-831268",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-924b67")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        