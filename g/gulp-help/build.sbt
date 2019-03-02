organization := "org.scalablytyped"
name := "gulp-help"
version := "0.0-unknown-dt-20180214Z-8bfd93"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-90134a",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-105e95",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-9f2687",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-b1a93a",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8c05a2",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "orchestrator" % "0.3-dt-20180214Z-e1fcad",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-84c23d",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190212Z-e0956d",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-865fd4",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-c2f5fc",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-9da176")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        