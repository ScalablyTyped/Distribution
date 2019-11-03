organization := "org.scalablytyped"
name := "gulp-tsd"
version := "0.0-unknown-dt-20190322Z-d7f5bb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.0-74324b",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-331843",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-e94a5c",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-ed4fa6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-4b5d2e",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-a27b56",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-6c4994",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-244407",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-030bb5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        