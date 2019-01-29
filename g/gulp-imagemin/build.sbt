organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-6e77e4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-2a200e",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-43c7bc",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-19eaa6",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-fdde07",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-35ed3a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-f37299")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        