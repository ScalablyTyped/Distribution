organization := "com.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180910Z-586ed6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "imagemin" % "6.0-dt-20180910Z-b42e37",
  "com.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180910Z-b35f54",
  "com.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180910Z-8f326d",
  "com.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180910Z-bef54c",
  "com.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180910Z-ccd253",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "svgo" % "1.0-dt-20180910Z-15386f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        