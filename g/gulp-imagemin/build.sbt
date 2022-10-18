organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "8.0-dt-20220223Z-c9a391"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "8.0-dt-20211202Z-a34a43",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20211202Z-ef1acc",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20211202Z-9fd0a6",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20211202Z-5e3c5e",
  "org.scalablytyped" %%% "imagemin-svgo" % "10.0-dt-20220222Z-b1bd6a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
