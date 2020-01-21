organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20181116Z-bcf0bc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-bbe06d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-6320e5",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-677686",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-65966e",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-ce939a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-6d12b1",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-2c9051",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-55440b",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-126fb5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        