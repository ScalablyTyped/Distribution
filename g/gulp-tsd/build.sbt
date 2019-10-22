organization := "org.scalablytyped"
name := "gulp-tsd"
version := "0.0-unknown-dt-20190322Z-b30863"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.2.2-03f68b",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-273fc3",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-fb64c3",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-49c0c0",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-4b5d2e",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191021Z-a8dc6e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-e0798f",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-6c4994",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-e4e569",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-4d6545")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        