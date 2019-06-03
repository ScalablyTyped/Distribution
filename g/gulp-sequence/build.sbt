organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20181116Z-adcb45"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.1-89b365",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e6f10e",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-a6a21f",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-e28a1a",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-ae6cfd",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-9d7ea4",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-434723",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-eab6d2",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-028849")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        