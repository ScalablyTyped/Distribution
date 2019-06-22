organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20181116Z-a261e1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.1-cce403",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-26d559",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-d745ce",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-bfc44b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e56e4c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-6a9465",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-434723",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-14d596",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-ff8ac5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        