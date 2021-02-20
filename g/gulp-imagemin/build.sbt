organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-bc7b2b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-ecd063",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20201001Z-a7f8c0",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-a82891",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-f74ddf",
  "org.scalablytyped" %%% "imagemin-svgo" % "8.0-dt-20200930Z-d60b01",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20200515Z-b13a12")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
