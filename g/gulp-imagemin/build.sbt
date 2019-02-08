organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-142250"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-8e98b2",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-7aaecb",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-0eedcd",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-112a4f",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-75a4f8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-92bf78")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        