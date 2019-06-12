organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-073c5b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-09bf68",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-3c4d61",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-ec28dc",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-72b3be",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-068c67",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20190605Z-17c853")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        