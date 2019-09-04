organization := "org.scalablytyped"
name := "gulp-protractor"
version := "v1.0.0-dt-20190322Z-8d9877"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.2-2050ac",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-2efa88",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-1a99a7",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-14d3ca",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-c93eb3",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190903Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-4ea263",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-e8ff6c",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-38bc67",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-c0c52a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        