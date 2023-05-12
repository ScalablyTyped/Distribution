organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "8.0-dt-20230510Z-f439f1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "8.0-dt-20230208Z-e54202",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20211202Z-ccff7d",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20211202Z-16afe3",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20211202Z-d031ae",
  "org.scalablytyped" %%% "imagemin-svgo" % "10.0-dt-20221025Z-6214b5",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
