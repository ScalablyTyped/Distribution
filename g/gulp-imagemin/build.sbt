organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-852779"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-2c45e3",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-b1b225",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-77f731",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-e1a0d6",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-9b6deb",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-2c614a",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-ee3de5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        