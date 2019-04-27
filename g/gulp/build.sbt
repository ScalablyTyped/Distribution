organization := "org.scalablytyped"
name := "gulp"
version := "4.0-dt-20190405Z-0596e9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-8aa365",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-68c397",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-f49f47",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-57138d",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-d36c3d",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-ed7e48",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-ef4bc6",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-4b648e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        