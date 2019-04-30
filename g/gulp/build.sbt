organization := "org.scalablytyped"
name := "gulp"
version := "4.0-dt-20190405Z-77c97c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-62e1b9",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e5f5fa",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-d63838",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-57138d",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-0b1816",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-ed7e48",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-93d7c4",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-3221de")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        