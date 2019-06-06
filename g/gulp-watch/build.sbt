organization := "org.scalablytyped"
name := "gulp-watch"
version := "v4.1.1-dt-20190322Z-07e0a7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-eec250",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-f53277",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-ae6cfd",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190605Z-895d8c",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-fbee84",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-5bbc79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        