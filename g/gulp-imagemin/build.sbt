organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-ebd328"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-a2b94a",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-6fab00",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-c0d6c0",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-22375c",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-8bc5cd",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-858b9e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        