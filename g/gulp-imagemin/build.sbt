organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-b4e8f5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-67cd1e",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-613469",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-6fae42",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-07d98a",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-170ad0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "svgo" % "1.2-dt-20190626Z-4e1669")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        