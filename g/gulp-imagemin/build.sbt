organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "8.0-dt-20220223Z-c122fb"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "imagemin" % "8.0-dt-20211202Z-8d6564",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20211202Z-6796dc",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20211202Z-84b8ce",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20211202Z-e5e7d3",
  "org.scalablytyped" %%% "imagemin-svgo" % "10.0-dt-20220222Z-938e3d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
