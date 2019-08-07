organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-664c10"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-8f4369",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-fdd409",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-47f5a6",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-d07f9d",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-0c929d",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190806Z-18826b",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "svgo" % "1.2-dt-20190722Z-392db2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        