organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-8e8b03"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-cb837a",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-597225",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-7f15eb",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-3fafe3",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-5b6643",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20200515Z-132958")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
