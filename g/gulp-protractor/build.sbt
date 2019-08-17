organization := "org.scalablytyped"
name := "gulp-protractor"
version := "v1.0.0-dt-20190322Z-81cc68"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.2-ecb81c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-3ec9ba",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-b8994f",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-1dc063",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-c1e405",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-a28e22",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-e8ff6c",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-690d63",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-83340e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        