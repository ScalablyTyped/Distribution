organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-1646d2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-4d1a9b",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-424209",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-960268",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-473194",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-817768",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20190605Z-ee3de5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        