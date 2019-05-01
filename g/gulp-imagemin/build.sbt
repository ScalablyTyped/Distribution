organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-9f1a45"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-44a22e",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-07fb5b",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-3dddf2",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-994f3c",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-f127a4",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-b7642c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        