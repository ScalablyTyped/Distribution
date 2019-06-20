organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-9672fa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-6d267b",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-437a5b",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-eb7a0e",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-442656",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-25af6f",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20190605Z-1c07a1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        