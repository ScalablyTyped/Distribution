organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "8.0-dt-20220223Z-931a9b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "8.0-dt-20211202Z-ecdb71",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20211202Z-756b3a",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20211202Z-1cf925",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20211202Z-43e595",
  "org.scalablytyped" %%% "imagemin-svgo" % "10.0-dt-20220222Z-837182",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
