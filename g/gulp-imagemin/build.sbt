organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-857b19"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-60a1f3",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-c233c8",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-df3ec7",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-4a4694",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-89fef0",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191023Z-ebe9d8",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20190927Z-b1a3a1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        