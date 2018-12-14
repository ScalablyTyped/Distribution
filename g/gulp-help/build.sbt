organization := "org.scalablytyped"
name := "gulp-help"
version := "0.0-unknown-dt-20180910Z-cedf41"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-da3710",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-a33ba6",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-c295f5",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180910Z-7e3363",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-45414c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "orchestrator" % "0.3-dt-20180910Z-b52150",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181206Z-a3f1d8",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180910Z-a91536",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180910Z-0917f9",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-9f101b",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-91125b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        