organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20181116Z-664fc7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-fc80ad",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-573195",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-82e68f",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-e2d67b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f20c2f",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-84ec9f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-f247a2",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-7bcb00",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-7718d6",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-b4bc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        