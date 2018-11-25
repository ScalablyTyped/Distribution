organization := "com.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180910Z-b579f0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "imagemin" % "6.0-dt-20180910Z-a2d27c",
  "com.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180910Z-1a98b5",
  "com.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180910Z-37288c",
  "com.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180910Z-f1ed83",
  "com.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180910Z-c36ae9",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "svgo" % "1.0-dt-20180910Z-15386f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        