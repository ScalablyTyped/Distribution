organization := "org.scalablytyped"
name := "gulp-protractor"
version := "v1.0.0-dt-20180214Z-bbcb85"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-f2620c",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-edb918",
  "org.scalablytyped" %%% "chokidar" % "2.1.2-650de1",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-334b9b",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-ec6929",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-a36b3b",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190306Z-1c28b5",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-273b1b",
  "org.scalablytyped" %%% "is-binary-path" % "2.0-dt-20180214Z-3fe20d",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-399c7b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "normalize-path" % "3.0-dt-20181225Z-d47c85",
  "org.scalablytyped" %%% "path-is-absolute" % "1.0-dt-20180214Z-5c48c7",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190212Z-2c9e89",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-a87277",
  "org.scalablytyped" %%% "upath" % "1.1.2-339e4c",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-6d1c80",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-08dbfd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        