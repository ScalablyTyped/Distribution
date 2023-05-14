organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "8.0-dt-20230510Z-59a7f8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "8.0-dt-20230208Z-dfce10",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20211202Z-5fa4fd",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20211202Z-07f192",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20211202Z-7b24fb",
  "org.scalablytyped" %%% "imagemin-svgo" % "10.0-dt-20221025Z-2189a9",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
