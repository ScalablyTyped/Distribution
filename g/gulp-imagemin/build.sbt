organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-b44ed2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-70269e",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-af8053",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-41c690",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-6d65e8",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-3fa7fb",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "svgo" % "1.2-dt-20190626Z-10455c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        