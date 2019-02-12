organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-a0a0db"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-4c38dc",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-6014cb",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-f54569",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-8fde4e",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-8ea51e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-92bf78")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        