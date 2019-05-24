organization := "org.scalablytyped"
name := "gulp-help-doc"
version := "0.0-unknown-dt-20190322Z-c3119e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.0-de7d6b",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-0df2a6",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-3d6084",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-dad3d3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f20c2f",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-14ae16",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-7bcb00",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-b0a159",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-55099d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        