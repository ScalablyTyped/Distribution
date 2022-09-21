organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "8.0-dt-20220223Z-a4b477"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "8.0-dt-20211202Z-4c42f2",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20211202Z-8ce762",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20211202Z-2649d1",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20211202Z-06f4b8",
  "org.scalablytyped" %%% "imagemin-svgo" % "10.0-dt-20220222Z-994f46",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
