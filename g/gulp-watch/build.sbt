organization := "org.scalablytyped"
name := "gulp-watch"
version := "v4.1.1-dt-20180214Z-7c4933"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-c73b68",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-9566d6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-c26d38",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190128Z-041fa3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        