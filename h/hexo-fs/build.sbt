organization := "org.scalablytyped"
name := "hexo-fs"
version := "0.2-dt-20190224Z-1cb1be"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-f2620c",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-edb918",
  "org.scalablytyped" %%% "chokidar" % "2.1.2-767f5a",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-ec6929",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20190212Z-58d5ed",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-d8c604",
  "org.scalablytyped" %%% "is-binary-path" % "2.0-dt-20180214Z-3fe20d",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-399c7b",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "normalize-path" % "3.0-dt-20181225Z-d47c85",
  "org.scalablytyped" %%% "path-is-absolute" % "1.0-dt-20180214Z-5c48c7",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "upath" % "1.1.2-339e4c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        