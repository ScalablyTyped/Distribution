organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "8.0-dt-20220223Z-db2114"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "8.0-dt-20211202Z-1fbc05",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20211202Z-48f636",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20211202Z-de5a3e",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20211202Z-fe2d1a",
  "org.scalablytyped" %%% "imagemin-svgo" % "10.0-dt-20221025Z-3e2203",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
