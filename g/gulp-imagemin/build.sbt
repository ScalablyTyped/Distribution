organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-538ff7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-9426c1",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-0d097c",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-29d57c",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-de744a",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-4d2bb2",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20190927Z-8cf37a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        