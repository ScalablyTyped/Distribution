organization := "org.scalablytyped"
name := "gulp"
version := "4.0-dt-20190405Z-0b387e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.2-123057",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-5d59e8",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-0db2d5",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-40806c",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-0b5836",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-10a15b",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-8f00e7",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-023edc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        