organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-9df88e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-4a1b61",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-b9099c",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-73cd6f",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-9f2551",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-134531",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-6753fb",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-0d52b5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        