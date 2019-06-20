organization := "org.scalablytyped"
name := "gulp-help"
version := "0.0-unknown-dt-20190322Z-8a0a6e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.1-888573",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-4e7b52",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-cbf372",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-9643ab",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e56e4c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "orchestrator" % "0.3-dt-20190322Z-905271",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-e11d4d",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-c9d380",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-434723",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-459738",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-434315")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        