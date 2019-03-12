organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-374c5f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-9f955d",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-75eeba",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-dc7690",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-048835",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-a1c061",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-28683c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        