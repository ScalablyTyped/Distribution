organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-6d9876"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-3e92e3",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-df01b8",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-ecf1cc",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-17b8fd",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-d570c8",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190731Z-f93e3e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "svgo" % "1.2-dt-20190722Z-392db2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        