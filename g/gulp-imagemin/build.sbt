organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-9279bf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-bd86f2",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-7b25fb",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-00bdbe",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-cc4ba8",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-4ab62d",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "svgo" % "1.2-dt-20190626Z-4e1669")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        