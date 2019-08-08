organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-4cd7cd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-f07afb",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-02ab90",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-d7b199",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-baf19e",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-7d6077",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190807Z-ed4b3f",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "svgo" % "1.2-dt-20190722Z-392db2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        