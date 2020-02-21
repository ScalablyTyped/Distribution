organization := "org.scalablytyped"
name := "gulp-protractor"
version := "v1.0.0-dt-20190322Z-1c484a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-345013",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-6f0a56",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-547a5a",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-b0d50f",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-623092",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-a96505",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-769b20",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-db8b66",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-5274f4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
