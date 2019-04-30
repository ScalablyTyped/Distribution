organization := "org.scalablytyped"
name := "gulp-watch"
version := "v4.1.1-dt-20190322Z-ee4df8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e5f5fa",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-d63838",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-57138d",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-93d7c4",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-3221de")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        