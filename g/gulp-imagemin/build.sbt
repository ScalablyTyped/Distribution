organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-34b36c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-008d36",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-d0f12c",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-66a25d",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-216fa5",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-dfb579",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-7e81b4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        