organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-c68508"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-1a5eed",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-44260d",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-7850c9",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-5f27dd",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-0f4820",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-92bf78")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        