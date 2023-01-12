organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "8.0-dt-20220223Z-e975d4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "8.0-dt-20211202Z-9044a0",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20211202Z-df5271",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20211202Z-c3a2a4",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20211202Z-e895b0",
  "org.scalablytyped" %%% "imagemin-svgo" % "10.0-dt-20221025Z-cf59f1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
