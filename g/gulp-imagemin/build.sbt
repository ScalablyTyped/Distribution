organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180910Z-81af3e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180910Z-c5e088",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180910Z-f080a8",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180910Z-72568d",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180910Z-5f8fc6",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180910Z-7124fe",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180910Z-e5c5b9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        