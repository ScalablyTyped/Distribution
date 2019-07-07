organization := "org.scalablytyped"
name := "gulp-help-doc"
version := "0.0-unknown-dt-20190322Z-f48874"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.2-951f09",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-de5e99",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-7f0d42",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-10ad88",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e56e4c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-e0eddb",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-434723",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-42356f",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-34d20f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        