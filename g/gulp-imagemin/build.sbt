organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-3d4fad"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-498947",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-27c2f8",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-e2eb79",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-eb1675",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-31a751",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-510f3f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        