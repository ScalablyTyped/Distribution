organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20181116Z-12c9f3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-e520ac",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-064f00",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-2d56e4",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-e1fd96",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-d2df64",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-0cecfc",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-b5f4da",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-403ab1",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-9cccbb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        