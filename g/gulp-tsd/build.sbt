organization := "org.scalablytyped"
name := "gulp-tsd"
version := "0.0-unknown-dt-20190322Z-acf6d2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.0-0e4aa3",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-3532b4",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-05a944",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-c098a9",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-bf1299",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-bf00b1",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-b5f4da",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-28bcbb",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-741253")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        