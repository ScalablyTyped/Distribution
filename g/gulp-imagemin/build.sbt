organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180910Z-8ed371"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180910Z-c46270",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180910Z-da2b85",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180910Z-302384",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180910Z-a04851",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180910Z-f3da39",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180910Z-cb4ac9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        