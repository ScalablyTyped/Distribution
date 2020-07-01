organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-cceb7c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-95630a",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-fc451a",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-173be0",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-c130fe",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-a2a5fd",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20200515Z-c08461")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
