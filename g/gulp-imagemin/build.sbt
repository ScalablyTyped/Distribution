organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-71994c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-f42102",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-ca0ff2",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-a78e4c",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-f347d9",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-1b8d9a",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "svgo" % "1.2-dt-20190626Z-10455c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        