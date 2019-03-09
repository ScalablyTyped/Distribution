organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-d64603"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-491a52",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-821d7b",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-67854c",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-f7adfb",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-04ca50",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-858b9e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        