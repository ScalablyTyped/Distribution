organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-ba6afb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-54a200",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-0c5dea",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-6bcc54",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-d464bb",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-488f20",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-28683c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        