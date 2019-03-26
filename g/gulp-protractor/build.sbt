organization := "org.scalablytyped"
name := "gulp-protractor"
version := "v1.0.0-dt-20190322Z-f7d2b5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-63350e",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-7fa312",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-a8059a",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-805214",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-f2c726",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-97177b",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190322Z-35356a",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20190322Z-2a9acd",
  "org.scalablytyped" %%% "is-binary-path" % "2.0-dt-20180214Z-56a50c",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-35474d",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-cec35d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "normalize-path" % "3.0-dt-20181225Z-e46ce6",
  "org.scalablytyped" %%% "path-is-absolute" % "1.0-dt-20180214Z-096348",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190212Z-93675c",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-4f339a",
  "org.scalablytyped" %%% "upath" % "1.1.2-41f636",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-80129d",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-63a551")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        