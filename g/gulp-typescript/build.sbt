organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-62138e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-65a65c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-334b9b",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-a36b3b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-ec3c08",
  "org.scalablytyped" %%% "source-map" % "0.7.3-169991",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-0aa8da",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-09c87f",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-6d1c80",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-08dbfd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        