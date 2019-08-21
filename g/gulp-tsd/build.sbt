organization := "org.scalablytyped"
name := "gulp-tsd"
version := "0.0-unknown-dt-20190322Z-aef4a6"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.2-39000e",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-216f4d",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-b6b89c",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-f66bd7",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-c1e405",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-42256a",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-e8ff6c",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-4f074e",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-aedcfa")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        