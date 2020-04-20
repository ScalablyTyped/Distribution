organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-b1cb9c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-53067f",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-3b6138",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-d545cf",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-f8190c",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-978656",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20200331Z-65027b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
