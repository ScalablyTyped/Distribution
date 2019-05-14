organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-ba4765"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-30df84",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-6abaa5",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-53d25a",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-51aa14",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-7c392b",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190513Z-e9c6e7",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-0d52b5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        