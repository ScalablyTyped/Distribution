organization := "org.scalablytyped"
name := "gulp-protractor"
version := "v1.0.0-dt-20190322Z-93b54b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-7b6838",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-a9b01d",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-a1c47c",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-9a40cf",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-57138d",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190417Z-002402",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-30ea99",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-ed7e48",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-65e826",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-22772c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        