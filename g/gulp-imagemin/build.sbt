organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-89846b"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-12970f",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-976c1b",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-01bb29",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-7835ee",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-e2932a",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "svgo" % "1.2-dt-20190722Z-59e240")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        