organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-aee778"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-1e48de",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-55bb8b",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-dc5a83",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-7d51c7",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-4e8fe8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-d31fcd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        