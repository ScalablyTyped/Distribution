organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "8.0-dt-20220223Z-713f01"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "8.0-dt-20211202Z-fba09c",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20211202Z-94f89f",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20211202Z-cc9f81",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20211202Z-16423e",
  "org.scalablytyped" %%% "imagemin-svgo" % "10.0-dt-20221025Z-a1eac4",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
