organization := "com.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20181102Z-e7da3e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "imagemin" % "6.0-dt-20181102Z-75326b",
  "com.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20181102Z-932362",
  "com.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20181102Z-e3ffd1",
  "com.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20181102Z-0e19ad",
  "com.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20181102Z-2337c4",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "svgo" % "1.0-dt-20181102Z-1b4a67",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        