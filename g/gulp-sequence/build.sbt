organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20181116Z-93089f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.2-5abdbf",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-fe1a97",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-12efa4",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-fe6ebc",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-40806c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-317602",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-220b7d",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-10a15b",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-e8068d",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-a1322f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        