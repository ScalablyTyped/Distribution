organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "8.0-dt-20220223Z-8718bd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "8.0-dt-20211202Z-57be28",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20211202Z-cba58a",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20211202Z-e8de84",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20211202Z-7c9641",
  "org.scalablytyped" %%% "imagemin-svgo" % "10.0-dt-20221025Z-752e87",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
