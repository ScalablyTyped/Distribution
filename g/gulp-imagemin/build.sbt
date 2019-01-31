organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-6d5eb0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-3261bc",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-7eb324",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-0cb58c",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-5b2bce",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-e73bc4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-f37299")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        