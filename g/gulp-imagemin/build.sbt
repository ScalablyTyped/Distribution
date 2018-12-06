organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180910Z-b2b938"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180910Z-309f41",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180910Z-d7ee68",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180910Z-28494e",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180910Z-268502",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180910Z-6576b1",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180910Z-4904c7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        