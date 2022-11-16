organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "8.0-dt-20220223Z-4f3a8b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "8.0-dt-20211202Z-348a71",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20211202Z-6b367c",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20211202Z-fae320",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20211202Z-1cb01b",
  "org.scalablytyped" %%% "imagemin-svgo" % "10.0-dt-20221025Z-5bc698",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
