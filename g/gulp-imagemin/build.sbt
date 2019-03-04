organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-31156e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-df8425",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-f70e88",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-7a2117",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-0a7f9b",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-0940ce",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-858b9e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        