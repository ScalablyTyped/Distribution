organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-e3cc3f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-6b3e1d",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-6dcd70",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-3a8867",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-79b40a",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-dd9feb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-c5d82f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        