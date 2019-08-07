organization := "org.scalablytyped"
name := "gulp"
version := "4.0-dt-20190405Z-aee710"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.2-96cbcb",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-cfb513",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-8f8147",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-40806c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190806Z-18826b",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-6fa914",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-10a15b",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-122f13",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-d80cad")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        