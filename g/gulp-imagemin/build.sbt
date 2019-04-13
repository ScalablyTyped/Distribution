organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-9885c7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-a27d67",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-a9d038",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-368da3",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-92a549",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-d5b065",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-28d4e0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-c81ab4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        