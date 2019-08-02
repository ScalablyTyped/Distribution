organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-c9a236"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-89b6cc",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-f7a652",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-e778f7",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-2fd1af",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-76ffd5",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "svgo" % "1.2-dt-20190722Z-392db2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        