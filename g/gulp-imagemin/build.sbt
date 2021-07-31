organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-ccab72"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-9facc6",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20201001Z-3be41f",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-8ca734",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-dde83e",
  "org.scalablytyped" %%% "imagemin-svgo" % "8.0-dt-20200930Z-745b00",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20200515Z-6b31d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
