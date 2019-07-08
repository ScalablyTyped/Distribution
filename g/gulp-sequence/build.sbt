organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20181116Z-995463"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.2-264b9c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-9c0ed0",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-f144dc",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-b4239a",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-41d0ad",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-53e3d7",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-f9ecbf",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-55bee9",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-898a69")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        