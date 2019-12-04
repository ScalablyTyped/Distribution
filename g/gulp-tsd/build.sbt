organization := "org.scalablytyped"
name := "gulp-tsd"
version := "0.0-unknown-dt-20190322Z-918624"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.0-ec7817",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ffd39a",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-ac055a",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-d73f49",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-bf1299",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-f3214e",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-b5f4da",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-00e72b",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-e506b1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        