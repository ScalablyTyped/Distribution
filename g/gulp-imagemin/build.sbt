organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-eca788"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-986c27",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-d604c4",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-7c96f1",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-13443a",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-e71689",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190422Z-40afee",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-c81ab4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        