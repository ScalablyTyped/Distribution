organization := "org.scalablytyped"
name := "gulp-tsd"
version := "0.0-unknown-dt-20190322Z-31b8bd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.2-81ab88",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-370be5",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-3f6075",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-9f3e13",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-40806c",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190731Z-f93e3e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-d75d19",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-10a15b",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-6be48d",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-12f463")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        