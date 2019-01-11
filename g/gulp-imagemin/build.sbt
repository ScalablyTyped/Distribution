organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-283ca3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-069cce",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-6c0e1e",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-e0a59f",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-41369d",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-54df1b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-c06bd8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        