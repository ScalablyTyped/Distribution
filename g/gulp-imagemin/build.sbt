organization := "com.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180910Z-342753"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "imagemin" % "6.0-dt-20180910Z-3b0bea",
  "com.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180910Z-0af2ff",
  "com.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180910Z-127e66",
  "com.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180910Z-8df00b",
  "com.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180910Z-2ee3ca",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "svgo" % "1.0-dt-20180910Z-5ee9dc",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        