organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-c29928"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-8af796",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-9d034a",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-057987",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-d57263",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-7ed0be",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190903Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "svgo" % "1.2-dt-20190722Z-ced410")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        