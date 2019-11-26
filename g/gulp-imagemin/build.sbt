organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-5ba9ce"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-c94749",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-a553db",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-7f9b44",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-364a9b",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-c21ef8",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20190927Z-361cf9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        