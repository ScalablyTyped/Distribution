organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "8.0-dt-20220223Z-945821"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "8.0-dt-20211202Z-2c615c",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20211202Z-39c89b",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20211202Z-1796e3",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20211202Z-4af3c2",
  "org.scalablytyped" %%% "imagemin-svgo" % "10.0-dt-20220222Z-881830",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
