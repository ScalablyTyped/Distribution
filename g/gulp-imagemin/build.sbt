organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-8eff75"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-04ef5f",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-e531e8",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-6542d5",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-fa9f4b",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-6b0c31",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-d31fcd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        