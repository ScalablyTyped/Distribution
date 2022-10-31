organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "8.0-dt-20220223Z-b896dc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "8.0-dt-20211202Z-49a72e",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20211202Z-71e18c",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20211202Z-ef90d6",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20211202Z-dca948",
  "org.scalablytyped" %%% "imagemin-svgo" % "10.0-dt-20221025Z-5d074f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
