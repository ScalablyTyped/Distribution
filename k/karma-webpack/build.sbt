organization := "org.scalablytyped"
name := "karma-webpack"
version := "2.0-dt-20190212Z-3d4d5f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-f2620c",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-9339aa",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "flatted" % "2.0.0-6028c6",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20190212Z-57950f",
  "org.scalablytyped" %%% "log4js" % "4.0.2-01f672",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-ba8ba9",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-3259f5",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "source-map" % "0.7.3-169991",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-c57887",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ffccaa",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190316Z-c56cd1",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-01920b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        