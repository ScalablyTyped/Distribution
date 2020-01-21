organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-926b92"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-e1b875",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-12815a",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-4167c8",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-5265db",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-afa60f",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20190927Z-f03fdc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        