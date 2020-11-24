organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-00fff7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-0c306a",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "7.0-dt-20201001Z-31ebd6",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-6ec14e",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-dd0fab",
  "org.scalablytyped" %%% "imagemin-svgo" % "8.0-dt-20200930Z-0b3b4d",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20200515Z-dbc1d4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
