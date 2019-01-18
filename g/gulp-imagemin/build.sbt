organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-c244e8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-dbee72",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-1197d6",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-bc88ef",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-d70b70",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-dcf95d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-f37299")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        