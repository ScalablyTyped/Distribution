organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-7db5ea"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-09f209",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-c846ae",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-f08d33",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-93d0be",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-2a3743",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-e3d05b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        