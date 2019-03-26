organization := "org.scalablytyped"
name := "gulp-watch"
version := "v4.1.1-dt-20190322Z-202c4e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-805214",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-97177b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-cec35d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-80129d",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-63a551")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        