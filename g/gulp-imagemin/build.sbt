organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "8.0-dt-20220223Z-1438d0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "8.0-dt-20211202Z-6009c7",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20211202Z-986036",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20211202Z-e05f16",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20211202Z-b363a5",
  "org.scalablytyped" %%% "imagemin-svgo" % "10.0-dt-20220222Z-d2b352",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
