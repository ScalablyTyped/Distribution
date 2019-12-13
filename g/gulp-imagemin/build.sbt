organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-6948b9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-493c0e",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-e31000",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-29bab5",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-2f4fc1",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-f4dbf8",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20190927Z-361cf9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        