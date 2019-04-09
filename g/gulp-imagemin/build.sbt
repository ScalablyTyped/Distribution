organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-115cf4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-dc83a8",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-12b15d",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-1a8c79",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-02532e",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-562d54",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-e3d05b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        