organization := "org.scalablytyped"
name := "gulp-help"
version := "0.0-unknown-dt-20190322Z-013a9d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.0-2c3b24",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b4670e",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-ad7510",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-ab1086",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-bf1299",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "orchestrator" % "0.3-dt-20190322Z-96a790",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-2de10c",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-20241b",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-b5f4da",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-256b7f",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-249b84")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        