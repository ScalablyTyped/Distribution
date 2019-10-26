organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20181116Z-4b1349"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.2.2-61099a",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-831834",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-88ad67",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-b2f95b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-4b5d2e",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-a03a4c",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-6c4994",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-b1dfc3",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-d64ab3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        