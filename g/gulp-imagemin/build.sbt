organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-de2868"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-f71873",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-cd6cd8",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-7755c1",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-407823",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-441061",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20190927Z-8cf37a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        