organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.1-60a4ae"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-65a65c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ab02fa",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-e32d77",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-ec3c08",
  "org.scalablytyped" %%% "source-map" % "0.7.3-169991",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-af9181",
  "org.scalablytyped" %%% "typescript" % "3.3.4000-09c87f",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-8e1d04",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-2ee702")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        