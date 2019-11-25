organization := "org.scalablytyped"
name := "gulp-protractor"
version := "v1.0.0-dt-20190322Z-4cc778"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.0-85045c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b40f63",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-3e6e61",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-90f4a7",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-bf1299",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-b97ddf",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-b5f4da",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-e0bd5f",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-78bd4c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        