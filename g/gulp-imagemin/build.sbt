organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180910Z-daacbe"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180910Z-a59001",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180910Z-a889f9",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180910Z-e22082",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180910Z-1539f0",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180910Z-cf2f4e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180910Z-5efc60")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        