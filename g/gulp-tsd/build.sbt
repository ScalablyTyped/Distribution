organization := "org.scalablytyped"
name := "gulp-tsd"
version := "0.0-unknown-dt-20180214Z-12beb7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d73b57",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-d1a095",
  "org.scalablytyped" %%% "chokidar" % "2.1.2-d8b185",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-a21654",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-57b73f",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-c54958",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190306Z-d37068",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-370ba5",
  "org.scalablytyped" %%% "is-binary-path" % "2.0-dt-20180214Z-aedbbf",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-2e5f61",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "normalize-path" % "3.0-dt-20181225Z-d39f37",
  "org.scalablytyped" %%% "path-is-absolute" % "1.0-dt-20180214Z-d4b47d",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190212Z-494b2e",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-af3936",
  "org.scalablytyped" %%% "upath" % "1.1.1-76b830",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-f03ed9",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-4bf914")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        