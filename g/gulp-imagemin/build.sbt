organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-cb50f0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-356d08",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-29d1a6",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-b280c0",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-d1c98c",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-c9bb95",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-c81ab4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        