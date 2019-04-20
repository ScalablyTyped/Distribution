organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-1b487b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-c9169f",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-0fc188",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-2ecbb5",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-9a3829",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-10653c",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-c81ab4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        