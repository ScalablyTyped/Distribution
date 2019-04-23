organization := "org.scalablytyped"
name := "gulp-protractor"
version := "v1.0.0-dt-20190322Z-756b28"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-9d0a62",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-8ee86c",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-055402",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-f7e112",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-57138d",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190422Z-40afee",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-e3b29c",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-ed7e48",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-c11e30",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-7e070d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        