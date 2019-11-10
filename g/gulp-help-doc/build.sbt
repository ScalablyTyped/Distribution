organization := "org.scalablytyped"
name := "gulp-help-doc"
version := "0.0-unknown-dt-20190322Z-d0f0fc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.0-d03459",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-5a6f0e",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-7a7d66",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-31a9ce",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-5242bd",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-28ad4b",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-6c4994",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-d4cc87",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-7449ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        