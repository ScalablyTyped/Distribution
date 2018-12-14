organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-c6cc26"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "1.0-dt-20180910Z-89fb0d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-274633",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-db7651",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-c002a7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180910Z-4aae9f",
  "org.scalablytyped" %%% "source-map" % "0.7.3-a4132b",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-c75d0b",
  "org.scalablytyped" %%% "typescript" % "3.2.2-542c62",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-1dc2db",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-38c0c0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        