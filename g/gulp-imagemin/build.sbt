organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-b210ee"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-7db0d4",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20201001Z-342efe",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-17703b",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-3cdfaa",
  "org.scalablytyped" %%% "imagemin-svgo" % "8.0-dt-20200930Z-9f2566",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20200515Z-b18a27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
