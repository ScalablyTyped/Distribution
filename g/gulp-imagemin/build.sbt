organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-bb0328"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-a0e500",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-d2ba7b",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-40ae50",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-fea408",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-6b63a0",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-ac4454")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        