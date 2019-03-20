organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-f3b7cd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-4b0f44",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-2b5b5b",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-4f9ed8",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-f28ed7",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-4877b8",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-28683c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        