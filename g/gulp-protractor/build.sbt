organization := "org.scalablytyped"
name := "gulp-protractor"
version := "v1.0.0-dt-20190322Z-ee2537"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.2.3-864ba8",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e7576c",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-40735d",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-83e10d",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-4b5d2e",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-6a5718",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-6c4994",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-4f91ba",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-3f57c5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        