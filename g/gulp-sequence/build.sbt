organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20181116Z-e3380c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-56a330",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-51363d",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-cab295",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-31fe7f",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f20c2f",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-6753fb",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-d1ad8a",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-7bcb00",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-7782e0",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-7fe208")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        