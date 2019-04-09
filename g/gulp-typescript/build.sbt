organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.1-389679"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-53fbc6",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-3f0045",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-45edcf",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-7a822c",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1b6210",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-189997",
  "org.scalablytyped" %%% "typescript" % "3.4.2-a42773",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-8ef541",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-aa6ca6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        