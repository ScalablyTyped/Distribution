organization := "org.scalablytyped"
name := "gulp"
version := "4.0-dt-20190405Z-e05e75"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.1-17a6cc",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-28fe34",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-b62ee0",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-384d13",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-7a6caa",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-434723",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-fc6086",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-8cc7bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        