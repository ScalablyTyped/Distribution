organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20181116Z-426901"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-a742c4",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-c0c58e",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-8a45c5",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-57885d",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-d2df64",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-a73402",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-b5f4da",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-f89933",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-4952cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        