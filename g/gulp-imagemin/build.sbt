organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180910Z-94ccc7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180910Z-e80030",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180910Z-278b4b",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180910Z-eb105d",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180910Z-a2d6fb",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180910Z-81c17a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180910Z-5efc60")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        