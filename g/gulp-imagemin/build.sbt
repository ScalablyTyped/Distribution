organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-722ffd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-b89b0c",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-8c47a6",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-208a53",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-e286c6",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-8da4bd",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-b7642c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        