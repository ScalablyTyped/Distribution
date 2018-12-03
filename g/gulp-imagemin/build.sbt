organization := "com.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180910Z-dde0a1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "imagemin" % "6.0-dt-20180910Z-db3a27",
  "com.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180910Z-11cf8b",
  "com.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180910Z-210233",
  "com.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180910Z-5d0f22",
  "com.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180910Z-0bc877",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "svgo" % "1.0-dt-20180910Z-5ee9dc",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        