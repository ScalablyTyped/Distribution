organization := "org.scalablytyped"
name := "gulp-help-doc"
version := "0.0-unknown-dt-20190322Z-727239"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-6f800f",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-306649",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-9e4254",
  "org.scalablytyped" %%% "fsevents" % "1.1-dt-20180214Z-11c363",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-a3b219",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20190329Z-819655",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-64bd6d",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-cbabd9",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20190322Z-8768f8",
  "org.scalablytyped" %%% "is-binary-path" % "2.0-dt-20180214Z-900f29",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20190329Z-4226a6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "normalize-path" % "3.0-dt-20181225Z-45086b",
  "org.scalablytyped" %%% "path-is-absolute" % "1.0-dt-20180214Z-ae48af",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-c75554",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-8c5417",
  "org.scalablytyped" %%% "upath" % "1.1.2-adf450",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-94425c",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-43ade6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        